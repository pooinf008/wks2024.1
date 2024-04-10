package br.ifba.inf011.model.protocolos.aplicacao.telnet;

import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;
import br.ifba.inf011.model.prototype.Prototype;

public class TelnetMessageResponse extends AbstractMessageData implements MessageResponse{
	
	
	public TelnetMessageResponse() {
		
	}
	
	
	public TelnetMessageResponse(TelnetMessageResponse outro) {
		super(outro);
	}
	
	@Override
	public Prototype prototipar() {
		return new TelnetMessageResponse(this);
	}		
	
	@Override
	protected String getNome() {
		return "Telnet Message Response";
	}	

}
