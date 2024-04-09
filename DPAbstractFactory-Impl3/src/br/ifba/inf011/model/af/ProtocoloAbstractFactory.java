package br.ifba.inf011.model.af;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;

public interface ProtocoloAbstractFactory {
	
	public MessageResponse createResponse();
	public MessageRequest createRequest();
	public Protocolo createProtocolo();	
	
	

}
