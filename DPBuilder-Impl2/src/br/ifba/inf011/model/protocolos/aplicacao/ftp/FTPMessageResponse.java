package br.ifba.inf011.model.protocolos.aplicacao.ftp;

import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;

public class FTPMessageResponse  extends AbstractMessageData implements MessageResponse{
	
	@Override
	protected String getNome() {
		return "FTP Message Response";
	}	

}