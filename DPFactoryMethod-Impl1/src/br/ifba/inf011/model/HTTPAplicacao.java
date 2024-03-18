package br.ifba.inf011.model;

import java.net.http.HttpResponse;

import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;

public class HTTPAplicacao extends Aplicacao {

	

	@Override
	protected MessageResponse createResponse() {
		return new HTTPMessageResponse();
	}
	@Override
	protected MessageRequest createRequest() {
		return new HTTPMessageRequest();
	}
	@Override
	protected Protocolo createProtocolo() {
		return new HTTPProtocolo();
	}	
	
	public static void main(String[] args) {
		(new HTTPAplicacao()).send();
	}	
	
}
