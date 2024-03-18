package br.ifba.inf011.model;

import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;

public abstract class Aplicacao {
	
	
	public void send() {
		Protocolo protocolo = this.createProtocolo();
		MessageRequest request = this.createRequest();
		MessageResponse response = this.createResponse();
		protocolo.open();
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	protected abstract MessageResponse createResponse();

	protected abstract MessageRequest createRequest();

	protected abstract Protocolo createProtocolo();


	
	

}
