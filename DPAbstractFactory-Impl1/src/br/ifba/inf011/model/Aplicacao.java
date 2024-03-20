package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;
import br.ifba.inf011.model.af.ProtocoloHTTPFactory;
import br.ifba.inf011.model.af.ProtocoloTelnetFactory;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send() {
		
		ProtocoloAbstractFactory af = new ProtocoloHTTPFactory();
		
		Protocolo protocolo = af.createProtocolo();
		MessageRequest request = af.createRequest();
		MessageResponse response = af.createResponse();
		protocolo.open();
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	
	public static void main(String[] args) {
		(new Aplicacao()).send();
	}		

}
