package br.ifba.inf011.model;

import br.ifba.inf011.model.builder.MensageiroBuilder;
import br.ifba.inf011.model.compactadores.EspacoCompactador;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send() throws Exception {
		
		
		Mensageiro<String> mensageiro = new MensageiroBuilder()
										    .reset()
										    .comProtocolo(TipoProtocolo.TELNET)
									        .confiavel()
									        .naoSeguro()
											.comCompactador(new EspacoCompactador())
											.build();
											
				
		mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
		
	}	
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send();
	}		

}
