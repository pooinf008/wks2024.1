package br.ifba.inf011.model;

import br.ifba.inf011.model.adapter.ClosedProtocolAdapter;
import br.ifba.inf011.model.builder.MensageiroBuilder;
import br.ifba.inf011.model.compactadores.DummyCompactador;
import br.ifba.inf011.model.compactadores.EspacoCompactador;
import br.ifba.inf011.model.credencial.AbertaCredencial;
import br.ifba.inf011.model.externo.ClosedProtocol;

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
	
	public void send2() throws Exception {
		
		ClosedProtocolAdapter adapter =  new ClosedProtocolAdapter(new ClosedProtocol(), "netpoint", 3345);
		Mensageiro<String> mensageiro = new MensageiroINF011(adapter, null, adapter, adapter, new AbertaCredencial(), new DummyCompactador());
		mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
		
	}		
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send2();
	}		

}
