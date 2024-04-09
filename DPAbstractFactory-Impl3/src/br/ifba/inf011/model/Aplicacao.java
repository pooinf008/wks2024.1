package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.protocolos.safety.SafetyProtocolo;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send(ProtocoloAbstractFactory af) {
		
		Protocolo protocolo =  af.createProtocolo();
		MessageRequest request = af.createRequest();
		MessageResponse response = af.createResponse();
		protocolo.open();
		try {
			((SafetyProtocolo)protocolo).valid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	

}
