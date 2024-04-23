package br.ifba.inf011.model.protocolos.aplicacao.http;

import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;

public class HTTPMessageResponse extends AbstractMessageData implements MessageResponse{
	
	@Override
	protected String getNome() {
		return "HTTP Message Response";
	}	

}
