package br.ifba.inf011.model.protocolos.aplicacao.ftp;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;

public class FTPMessageRequest extends AbstractMessageData implements MessageRequest{

	@Override
	protected String getNome() {
		return "FTP Message Request";
	}
	

}