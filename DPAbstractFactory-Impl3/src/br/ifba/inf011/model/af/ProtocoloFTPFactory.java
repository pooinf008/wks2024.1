package br.ifba.inf011.model.af;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;

public class ProtocoloFTPFactory implements ProtocoloAbstractFactory{
	
	@Override
	public MessageResponse createResponse() {
		return new FTPMessageResponse();
	}

	@Override
	public MessageRequest createRequest() {
		return new FTPMessageRequest();
	}

	@Override
	public Protocolo createProtocolo() {
		return new FTPProtocolo();
	}	

}
