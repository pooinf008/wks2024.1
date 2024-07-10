package br.ifba.inf011.model.protocolos.aplicacao.http;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;

public class HTTPMessageRequest extends AbstractMessageData implements MessageRequest{

	@Override
	protected String getNome() {
		return "HTTP Message Request";
	}
	

}