package br.ifba.inf011.model.af;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;
import br.ifba.inf011.model.protocolos.telnet.TelnetMessageRequest;
import br.ifba.inf011.model.protocolos.telnet.TelnetMessageResponse;
import br.ifba.inf011.model.protocolos.telnet.TelnetProtocolo;

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
	public Protocolo createProtocolo() {
		return new TelnetProtocolo();
	}

}
