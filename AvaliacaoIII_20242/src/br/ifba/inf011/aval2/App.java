package br.ifba.inf011.aval2;

import java.time.LocalDate;
import java.util.Stack;

import br.ifba.inf011.aval2.memento.ArquivoWarehouse;
import br.ifba.inf011.aval2.model.Arquivo;
import br.ifba.inf011.aval2.model.ArquivoHistorico;
import br.ifba.inf011.aval2.model.Credencial;
import br.ifba.inf011.aval2.model.Entrada;
import br.ifba.inf011.aval2.model.EntradaOperavel;
import br.ifba.inf011.aval2.model.Pasta;
import br.ifba.inf011.aval2.model.bridge.Binario;
import br.ifba.inf011.aval2.model.bridge.Texto;
import br.ifba.inf011.aval2.model.proxy.LogOperacaoProxy;

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
		
		raiz.addFilho(a);
		raiz.addFilho(b);
		
		a.addFilho(a1);
		
		b.addFilho(c);
		b.addFilho(b1);
		
		c.addFilho(c1);

		try {
			a1.escrever(user01, "NÃO É MAIS CINCO");
		}catch(IllegalAccessException ex) {
			System.out.println("NÃO FOI POSSIVEL ESCREVER EM A1");
		}
			
		a1.bloquear();
		b1.bloquear();
		c1.bloquear();
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");
			
		
		
		a1.bloquear();
		b1.bloquear();
		c1.bloquear();
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");

		a1.liberar();
		b1.liberar();
		c1.liberar();
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");


		a1.somenteLeitura();
		try {
			a1.escrever(user01, "TENTANDO ALTERAR NOVAMENTE");
		}catch(IllegalAccessException ex) {
			System.out.println("NÃO FOI POSSIVEL ESCREVER EM A1");
		}
		
		try {
			System.out.println("A1: " + a1.ler(user01));
		} catch (IllegalAccessException e) {
			System.out.println("NÃO FOI POSSIVEL LER DE A1");
		}			
		
		a1.liberar();
		a1.excluir();
		b1.excluir();
		c1.excluir();
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");
	}
	
	
	public void runQ2() {
		
		Credencial user01 = new Credencial("user01");
		Credencial user02 = new Credencial("user02");
		
		EntradaOperavel a1 = new LogOperacaoProxy(new Arquivo(new Binario(), "A1", LocalDate.now(), "CINCO"));
		EntradaOperavel b1 = new LogOperacaoProxy(new Arquivo(new Texto(), "B1", LocalDate.now(), "UM ARQUIVO TAMANHO GRANDE"));
		EntradaOperavel c1 = new Arquivo(new Binario(), "C1", LocalDate.now(), "UM ARQUIVO TAMANHO MUITO MUITO GRANDE");
		
		Entrada a = new Pasta("A", LocalDate.now());
		Entrada b = new Pasta("B", LocalDate.now());
		Entrada c = new Pasta("C", LocalDate.now());
		Entrada raiz = new Pasta("/", LocalDate.now());
		
		raiz.addFilho(a);
		raiz.addFilho(b);
		
		a.addFilho(a1);
		
		b.addFilho(c);
		b.addFilho(b1);
		
		c.addFilho(c1);
		
		try {
			System.out.println(a1.ler(user01) + " " + a1.dump());
			System.out.println(a1.ler(user01) + " " + a1.dump());
			System.out.println(a1.ler(user01) + " " + a1.dump());
			System.out.println(b1.ler(user01) + " " + b1.dump());
			System.out.println(b1.ler(user02) + " " + b1.dump());
		}catch(IllegalAccessException e) {
			System.out.println("Erro em Leitura");
		}
		
		System.out.println("\nLOGS\n");
		
		System.out.println(((LogOperacaoProxy) a1).doLog());
		System.out.println(((LogOperacaoProxy) b1).doLog());
		
	}	
	
	
	public void runQ3() throws IllegalAccessException {
		
		Credencial user01 = new Credencial("user01");
		
		ArquivoHistorico c1 = new ArquivoHistorico(new Binario(), "C1", LocalDate.now(), "UM ARQUIVO TAMANHO MUITO MUITO GRANDE");
		ArquivoWarehouse aw = new ArquivoWarehouse(c1);
		System.out.println(c1.ler(user01));
		aw.save();
		
		c1.escrever(user01, "NOVO CONTEÚDO - 001");
		System.out.println(c1.ler(user01));
		aw.save();

		c1.escrever(user01, "NOVO CONTEÚDO - 002");
		System.out.println(c1.ler(user01));
		
		aw.undo();
		System.out.println(c1.ler(user01));
		
		aw.undo();
		System.out.println(c1.ler(user01));
		
		
	}		
	
	
	public static void main(String[] args) throws IllegalAccessException {
		App app = new App();
		System.out.println("QUESTÃO I");
		app.runQ1();
		System.out.println("QUESTÃO II");
		app.runQ2();
		System.out.println("QUESTÃO III");
		app.runQ3();
		

	}

}
