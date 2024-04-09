package br.ifba.inf011.model.protocolos.aplicacao.ftp;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;
import br.ifba.inf011.model.prototype.Prototype;

public class FTPMessageRequest extends AbstractMessageData implements MessageRequest{

	public FTPMessageRequest() {
		
	}
	
	public FTPMessageRequest(FTPMessageRequest outro) {
		super(outro);
	}
	
	@Override
	public Prototype prototipar() {
		return new FTPMessageRequest(this);
	}	
	
	@Override
	protected String getNome() {
		return "FTP Message Request";
	}


	

}