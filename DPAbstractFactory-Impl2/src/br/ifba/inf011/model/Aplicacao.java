package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;
import br.ifba.inf011.model.af.ProtocoloHTTPFactory;
import br.ifba.inf011.model.af.ProtocoloSafetyFactory;
import br.ifba.inf011.model.af.ProtocoloTelnetFactory;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send() throws Exception {
		
		ProtocoloAbstractFactory af = new ProtocoloHTTPFactory();
		
		Protocolo protocolo = (Protocolo) af.createItemProtocolo("Protocolo");
		MessageRequest request = (MessageRequest) af.createItemProtocolo("MessageRequest");
		MessageResponse response = (MessageResponse) af.createItemProtocolo("MessageResponse");
		Credencial credencial = (Credencial) af.createItemProtocolo("Credencial");
		protocolo.open();
		credencial.setUser("admin");
		credencial.setPasswd("1234");
		credencial.valid();
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send();
	}		

}
