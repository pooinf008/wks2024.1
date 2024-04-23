package br.ifba.inf011.model.af;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;

public interface ProtocoloAbstractFactory {
	
	public MessageResponse createResponse();
	public MessageRequest createRequest();
	public AplicacaoProtocolo createProtocolo();	
	
	

}
