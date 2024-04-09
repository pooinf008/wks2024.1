package br.ifba.inf011.model.protocolos.aplicacao.telnet;

import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;

public class TelnetMessageResponse extends AbstractMessageData implements MessageResponse{
	
	@Override
	protected String getNome() {
		return "Telnet Message Response";
	}	

}
