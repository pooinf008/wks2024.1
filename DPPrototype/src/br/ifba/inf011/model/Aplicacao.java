package br.ifba.inf011.model;

import br.ifba.inf011.model.builder.MensageiroBuilder;
import br.ifba.inf011.model.compactadores.EspacoCompactador;
import br.ifba.inf011.model.protocolos.transporte.UDPProtocolo;
import br.ifba.inf011.model.prototype.GerentePrototipos;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	
	public Aplicacao() throws Exception {
		
		this.init();
	}
	
	public void init() throws Exception {
		
		Mensageiro<String> mensageiro = new MensageiroBuilder()
										    .reset()
										    .comProtocolo(TipoProtocolo.TELNET)
									        .confiavel()
									        .naoSeguro()
											.comCompactador(new EspacoCompactador())
											.build();
		
		Mensageiro<String> mensageiro2 = new MensageiroBuilder()
			    .reset()
			    .comProtocolo(TipoProtocolo.HTTP)
		        .naoConfiavel()
		        .naoSeguro()
				.build();

		
		
		GerentePrototipos.instancia().registrar("MENSAGEIRO_A", mensageiro);
		GerentePrototipos.instancia().registrar("MENSAGEIRO_B", mensageiro2);
		
	}	
	
	private void send() throws Exception {
		
		Mensageiro<String> mensageiro = GerentePrototipos.instancia().buscar("MENSAGEIRO_A");
		mensageiro.enviar("ABC");
		System.out.println("******************");
		
		Mensageiro<String> mensageiro2 = GerentePrototipos.instancia().buscar("MENSAGEIRO_A");
		mensageiro2.modificarTransporte(new UDPProtocolo());
		mensageiro2.enviar("ABC");
		System.out.println("******************");

		mensageiro.enviar("ABC");
		System.out.println("******************");

		
		Mensageiro<String> mensageiro3 = GerentePrototipos.instancia().buscar("MENSAGEIRO_B");
		mensageiro3.enviar("CDE");
		System.out.println("******************");		
		
		
		
		
		
	}	
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send();
	}

		

}
