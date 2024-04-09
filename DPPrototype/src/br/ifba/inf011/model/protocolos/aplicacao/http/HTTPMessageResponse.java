package br.ifba.inf011.model.protocolos.aplicacao.http;

import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;
import br.ifba.inf011.model.prototype.Prototype;

public class HTTPMessageResponse extends AbstractMessageData implements MessageResponse{
	
	public HTTPMessageResponse() {
		
	}	
	
	public HTTPMessageResponse(HTTPMessageResponse outro) {
		super(outro);
	}
	
	@Override
	public Prototype prototipar() {
		return new HTTPMessageResponse(this);
	}	
	
	@Override
	protected String getNome() {
		return "HTTP Message Response";
	}	

}
