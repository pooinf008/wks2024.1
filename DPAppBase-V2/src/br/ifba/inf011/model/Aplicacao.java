package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;
import br.ifba.inf011.model.compactadores.EspacoCompactador;
import br.ifba.inf011.model.credencial.AdminCredencial;
import br.ifba.inf011.model.protocolos.transporte.UDPProtocolo;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send() throws Exception {
		
		ProtocoloAbstractFactory paf = new ProtocoloFTPFactory();
//		Mensageiro<String> mensageiro = new MensageiroINF011(paf.createProtocolo(), paf.createRequest(), paf.createResponse());
//		Mensageiro<String> mensageiro = new MensageiroINF011(paf.createProtocolo(), paf.createRequest(), paf.createResponse(), new EspacoCompactador());
		
		Mensageiro<String> mensageiro = new MensageiroINF011(paf.createProtocolo(), new UDPProtocolo(),
										 					 paf.createRequest(), paf.createResponse(), 
										 					 new AdminCredencial(), new EspacoCompactador());		
		
		
		mensageiro.enviar("MENSAGEM ENVIADA");
	}
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send();
	}		

}
