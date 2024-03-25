package br.ifba.inf011.model.af;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPProtocolo;

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
	public AplicacaoProtocolo createProtocolo() {
		return new FTPProtocolo();
	}	

}
