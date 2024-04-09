package br.ifba.inf011.model;

import br.ifba.inf011.model.builder.MensageiroBuilder;
import br.ifba.inf011.model.builder.MensageiroInfoBuilder;
import br.ifba.inf011.model.builder.MessageDirector;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send() throws Exception {
		
		
		MensageiroBuilder mensageiroBuilder = new MensageiroBuilder();
		MessageDirector messageDirector = new MessageDirector(mensageiroBuilder);
		messageDirector.createComunicacaoBasica();
		Mensageiro<String> mensageiro = mensageiroBuilder.getMensageiro();
		mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
		
		MensageiroInfoBuilder mensageiroBuilder2 = new MensageiroInfoBuilder();
		messageDirector.setBuilder(mensageiroBuilder2);
		messageDirector.createComunicacaoBasica();
		System.out.println(mensageiroBuilder2.getMensageiroInfo());
	}	
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send();
	}		

}
