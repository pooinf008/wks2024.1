package br.ifba.inf011.aval2;

import java.time.LocalDate;

import br.ifba.inf011.aval2.decorator.ArquivoDecorator;
import br.ifba.inf011.aval2.decorator.AssinaturaDecorator;
import br.ifba.inf011.aval2.decorator.CabecalhoDecorator;
import br.ifba.inf011.aval2.model.Arquivo;
import br.ifba.inf011.aval2.model.ArquivoHistorico;
import br.ifba.inf011.aval2.model.Credencial;
import br.ifba.inf011.aval2.model.Entrada;
import br.ifba.inf011.aval2.model.EntradaOperavel;
import br.ifba.inf011.aval2.model.Pasta;
import br.ifba.inf011.aval2.model.bridge.Binario;
import br.ifba.inf011.aval2.observer.ArquivoWarehouseAutoSave;

public class App {
	
	public void runQ1() throws IllegalAccessException  {
		
		Credencial user01 = new Credencial("user01");
		
		EntradaOperavel a1 = new Arquivo(new Binario(), "A1", LocalDate.now(), "00011000100011100000011111110101");
		EntradaOperavel b1 = new Arquivo(new Binario(),"B1", LocalDate.now(), "UM ARQUIVO TAMANHO GRANDE");
		EntradaOperavel c1 = new Arquivo(new Binario(), "C1", LocalDate.now(), "UM ARQUIVO TAMANHO MUITO MUITO GRANDE");
		
		Entrada a = new Pasta("A", LocalDate.now());
		Entrada b = new Pasta("B", LocalDate.now());
		Entrada c = new Pasta("C", LocalDate.now());
		Entrada raiz = new Pasta("/", LocalDate.now());
		
		
		ArquivoDecorator arqDecorator = new AssinaturaDecorator(
													new CabecalhoDecorator(b1, "Cabeçalho\n"),
											 	"\nAssinatura");
		
		raiz.addFilho(a);
		raiz.addFilho(b);
		
		a.addFilho(arqDecorator);
		
		b.addFilho(c);
		b.addFilho(b1);
		
		c.addFilho(c1);

		System.out.println(arqDecorator.ler(user01));
		System.out.println(b1.ler(user01));
		
	}
	
	
	
	public void runQ2() throws IllegalAccessException {
		
		Credencial user01 = new Credencial("user01");
		
		ArquivoHistorico c1 = new ArquivoHistorico(new Binario(), "C1", LocalDate.now(), "UM ARQUIVO TAMANHO MUITO MUITO GRANDE");
		
		ArquivoWarehouseAutoSave aw = new ArquivoWarehouseAutoSave(c1);
		System.out.println(c1.ler(user01));
		
		c1.escrever(user01, "NOVO CONTEÚDO - 001");
		System.out.println(c1.ler(user01));

		c1.escrever(user01, "NOVO CONTEÚDO - 002");
		System.out.println(c1.ler(user01));
		
		aw.lastVersion();
		System.out.println(c1.ler(user01));
		
		aw.lastVersion();
		System.out.println(c1.ler(user01));
		
		
	}		
	
	
	public static void main(String[] args) throws IllegalAccessException {
		App app = new App();
		System.out.println("QUESTÃO I");
		app.runQ1();
		System.out.println("QUESTÃO II");
		app.runQ2();

	}

}
