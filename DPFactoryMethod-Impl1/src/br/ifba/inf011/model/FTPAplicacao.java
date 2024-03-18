package br.ifba.inf011.model;

import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;

public class FTPAplicacao extends Aplicacao{

	@Override
	protected MessageResponse createResponse() {
		return new FTPMessageResponse();
	}

	@Override
	protected MessageRequest createRequest() {
		return new FTPMessageRequest();
	}

	@Override
	protected Protocolo createProtocolo() {
		return new FTPProtocolo();
	}

	public static void main(String[] args) {
		(new FTPAplicacao()).send();
	}	
	
}
