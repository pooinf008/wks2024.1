package br.ifba.inf011.model.protocolos.aplicacao.telnet;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;
import br.ifba.inf011.model.protocolos.aplicacao.http.HTTPMessageResponse;
import br.ifba.inf011.model.prototype.Prototype;

public class TelnetMessageRequest extends AbstractMessageData implements MessageRequest{

	public TelnetMessageRequest() {
		
	}
	
	public TelnetMessageRequest(TelnetMessageRequest outro) {
		super(outro);
	}
	
	@Override
	public Prototype prototipar() {
		return new TelnetMessageRequest(this);
	}		
	
	@Override
	protected String getNome() {
		return "Telnet Message Request";
	}
	

}
