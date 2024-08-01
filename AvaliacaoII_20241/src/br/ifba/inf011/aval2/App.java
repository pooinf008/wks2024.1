package br.ifba.inf011.aval2;

import java.time.LocalDate;

import br.ifba.inf011.aval2.model.Arquivo;
import br.ifba.inf011.aval2.model.Credencial;
import br.ifba.inf011.aval2.model.Entrada;
import br.ifba.inf011.aval2.model.EntradaLegivel;
import br.ifba.inf011.aval2.model.Pasta;
import br.ifba.inf011.aval2.model.proxy.LogLeituraArquivoProxy;

public class App {
	
	
	public void runQ1() {
		Entrada a1 = new Arquivo("A1", LocalDate.now(), 5L);
		Entrada b1 = new Arquivo("B1", LocalDate.now(), 20L);
		Entrada c1 = new Arquivo("C1", LocalDate.now(), 10L);
		
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
			a1.addFilho(c1);
		}catch (UnsupportedOperationException e) {
			System.out.println("Não foi possível adicionar C1 a A1");
		}	
		
		
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");
		
		
	}
	
	
	public void runQ2() {
		
		Credencial user01 = new Credencial("user01");
		Credencial user02 = new Credencial("user02");
		
		EntradaLegivel a1 = new LogLeituraArquivoProxy(new Arquivo("A1", LocalDate.now(), 5L));
		EntradaLegivel b1 = new LogLeituraArquivoProxy(new Arquivo("B1", LocalDate.now(), 20L));
		EntradaLegivel c1 = new Arquivo("C1", LocalDate.now(), 10L);
		
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
			System.out.println(a1.ler(user01));
			System.out.println(a1.ler(user01));
			System.out.println(a1.ler(user01));
			System.out.println(b1.ler(user01));
			System.out.println(b1.ler(user02));
		}catch(IllegalAccessException e) {
			System.out.println("Erro em Leitura");
		}
		
		System.out.println("\nLOGS\n");
		
		System.out.println(((LogLeituraArquivoProxy) a1).doLog());
		System.out.println(((LogLeituraArquivoProxy) b1).doLog());
		
	}	
	
	
	public static void main(String[] args) {
		App app = new App();
		app.runQ1();
		app.runQ2();

	}

}
