package br.ifba.inf011.model.protocolos.aplicacao.http;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPMessageResponse;
import br.ifba.inf011.model.prototype.Prototype;

public class HTTPMessageRequest extends AbstractMessageData implements MessageRequest{

	public HTTPMessageRequest() {
		
	}
	
	public HTTPMessageRequest(HTTPMessageRequest outro) {
		super(outro);
	}
	
	@Override
	public Prototype prototipar() {
		return new HTTPMessageRequest(this);
	}
	
	@Override
	protected String getNome() {
		return "HTTP Message Request";
	}
	

}