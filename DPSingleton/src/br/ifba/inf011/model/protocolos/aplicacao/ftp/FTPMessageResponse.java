package br.ifba.inf011.model.protocolos.aplicacao.ftp;

import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractMessageData;
import br.ifba.inf011.model.prototype.Prototype;

public class FTPMessageResponse  extends AbstractMessageData implements MessageResponse{
	
	public FTPMessageResponse() {
		
	}
	
	public FTPMessageResponse(FTPMessageResponse outro) {
		super(outro);
	}
	
	@Override
	public Prototype prototipar() {
		return new FTPMessageResponse(this);
	}	
	
	@Override
	protected String getNome() {
		return "FTP Message Response";
	}	

}