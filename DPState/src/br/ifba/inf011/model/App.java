package br.ifba.inf011.model;

import javax.naming.OperationNotSupportedException;

import br.ifba.inf011.model.cor.Processador;
import br.ifba.inf011.model.cor.ProcessadorLangEng;
import br.ifba.inf011.model.cor.ProcessadorLangIta;
import br.ifba.inf011.model.cor.ProcessadorMatContar;

public class App {
	
	public void run() throws OperationNotSupportedException {

		
		Processador processadores = new ProcessadorLangEng(
									  new ProcessadorLangIta(
										new ProcessadorMatContar()	  
											  )); 
		Mensagem mensagem = new Mensagem("OLA LA VEM 1 ELA");
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		mensagem.attachMudancaEstadoObserver(cliente1);
		mensagem.attachMudancaEstadoObserver(cliente2);
		
		mensagem.addHeader("MAT", "SUBS_NUM");
		mensagem.addHeader("LANGUAGE_ITA", "ITA");
		mensagem.addHeader("LANGUAGE_ENG", "ENG");
		mensagem.addHeader("TAMANHO", "CONTAR");
		
		mensagem.selar();
		mensagem.edite();
		
		try {
			mensagem.setConteudo("Meu novo conteudo!");
		}catch(OperationNotSupportedException e) {
			System.out.println("No Estado Atual da Mensagem, o Conteudo Não pode Ser Modificado");
		}
		
		ProcessadorMensagem processador = new ProcessadorMensagem(processadores);
		processador.processar(mensagem);
		System.out.println(mensagem);
	}	
	
	
	public static void main(String[] args) throws OperationNotSupportedException {
		(new App()).run();
	}
	

}
