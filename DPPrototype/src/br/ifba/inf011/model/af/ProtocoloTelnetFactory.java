package br.ifba.inf011.model.af;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.telnet.TelnetMessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.telnet.TelnetMessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.telnet.TelnetProtocolo;

public class ProtocoloTelnetFactory implements ProtocoloAbstractFactory{
	
	@Override
	public MessageResponse createResponse() {
		return new TelnetMessageResponse();
	}
	@Override
	public MessageRequest createRequest() {
		return new TelnetMessageRequest();
	}
	@Override
	public AplicacaoProtocolo createProtocolo() {
		return new TelnetProtocolo();
	}

}
