package br.ifba.inf011.model;

import javax.naming.OperationNotSupportedException;

import br.ifba.inf011.model.cor.Processador;
import br.ifba.inf011.model.cor.ProcessadorLangEng;
import br.ifba.inf011.model.cor.ProcessadorLangIta;
import br.ifba.inf011.model.cor.ProcessadorMatContar;
import br.ifba.inf011.model.memento.MensagemHistoria;

public class App {
	
	public void run() throws OperationNotSupportedException {
		Processador processadores = new ProcessadorLangEng(
									  new ProcessadorLangIta(
										new ProcessadorMatContar()	  
											  )); 
		Mensagem mensagem = new Mensagem("OLA LA VEM 1 ELA");
		
		MensagemHistoria mh = new MensagemHistoria(mensagem);
		
		mh.save();
		
		System.out.println("APOS SAVE");
		System.out.println(mensagem);
		
		
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
		
		System.out.println("...");
		System.out.println(mensagem);
		
		mh.undo();
		System.out.println("APOS UNDO");
		System.out.println(mensagem);		
		
		ProcessadorMensagem processador = new ProcessadorMensagem(processadores);
		processador.processar(mensagem);
		
	}	
	
	
	public static void main(String[] args) throws OperationNotSupportedException {
		(new App()).run();
	}
	

}
