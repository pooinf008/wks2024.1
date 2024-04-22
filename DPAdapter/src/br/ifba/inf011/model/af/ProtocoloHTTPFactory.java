package br.ifba.inf011.model.af;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.http.HTTPProtocolo;

public class ProtocoloHTTPFactory implements ProtocoloAbstractFactory{
	
	@Override
	public MessageResponse createResponse() {
		return new HTTPMessageResponse();
	}
	@Override
	public MessageRequest createRequest() {
		return new HTTPMessageRequest();
	}
	@Override
	public AplicacaoProtocolo createProtocolo() {
		return new HTTPProtocolo();
	}

}
