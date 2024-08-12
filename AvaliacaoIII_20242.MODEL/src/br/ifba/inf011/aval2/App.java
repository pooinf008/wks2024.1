package br.ifba.inf011.aval2;

import java.time.LocalDate;

import br.ifba.inf011.aval2.model.Arquivo;
import br.ifba.inf011.aval2.model.Credencial;
import br.ifba.inf011.aval2.model.Entrada;
import br.ifba.inf011.aval2.model.EntradaOperavel;
import br.ifba.inf011.aval2.model.Pasta;

public class App {
	
	
	public void runQ1() throws IllegalAccessException  {
		
		Credencial user01 = new Credencial("user01");
		
		EntradaOperavel a1 = new Arquivo("A1", LocalDate.now(), "00011000100011100000011111110101");
		EntradaOperavel b1 = new Arquivo("B1", LocalDate.now(), "UM ARQUIVO TAMANHO GRANDE");
		EntradaOperavel c1 = new Arquivo("C1", LocalDate.now(), "UM ARQUIVO TAMANHO MUITO MUITO GRANDE");
		
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
			b1.escrever(user01, "CINCO");
		}catch(IllegalAccessException ex) {
			System.out.println("NÃO FOI POSSIVEL ESCREVER EM A1");
		}
			
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");

		try {
			b1.escrever(user01, "CINCO+2");
		}catch(IllegalAccessException ex) {
			System.out.println("NÃO FOI POSSIVEL ESCREVER EM A1");
		}
		
		try {
			System.out.println("B1: " + b1.ler(user01));
		} catch (IllegalAccessException e) {
			System.out.println("NÃO FOI POSSIVEL LER DE A1");
		}			
		
		System.out.println(raiz.getNome() + ": " + raiz.getTamanho() + "K");
	}
	
	
	public static void main(String[] args) throws IllegalAccessException {
		App app = new App();
		app.runQ1();
	}

}
