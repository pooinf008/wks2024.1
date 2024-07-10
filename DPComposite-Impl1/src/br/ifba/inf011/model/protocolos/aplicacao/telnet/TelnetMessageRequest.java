package br.ifba.inf011.model.protocolos.aplicacao.telnet;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;

public class TelnetMessageRequest extends AbstractMessageData implements MessageRequest{

	@Override
	protected String getNome() {
		return "Telnet Message Request";
	}
	

}
