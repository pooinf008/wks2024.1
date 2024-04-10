package br.ifba.inf011.model;

import br.ifba.inf011.model.builder.MensageiroBuilder;
import br.ifba.inf011.model.compactadores.EspacoCompactador;
import br.ifba.inf011.model.prototype.GerenteExtendidoPrototipos;
import br.ifba.inf011.model.prototype.GerentePrototipos;
import br.ifba.inf011.model.singleton.GerenteSingletons;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	private GerenteSingletons singletons;
	
	
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

		this.singletons = new GerenteSingletons();
		
		this.singletons.registrar("Basico", GerentePrototipos.instancia());
		this.singletons.registrar("Extendido", GerenteExtendidoPrototipos.instancia());
		
		
	}	
	
	private void send() throws Exception {
		
//		Mensageiro<String> mensageiro = GerentePrototipos.instancia().buscar("MENSAGEIRO_A");
//		mensageiro.enviar("ABC");
		
		String gerenteEmUso =  this.singletons.buscar("Extendido").getNome();
		System.out.println(gerenteEmUso);
		
		
		
	}	
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send();
	}

		

}
