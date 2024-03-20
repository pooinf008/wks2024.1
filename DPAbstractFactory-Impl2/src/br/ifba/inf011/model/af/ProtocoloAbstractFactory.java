package br.ifba.inf011.model.af;

import br.ifba.inf011.model.ItemProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;

public interface ProtocoloAbstractFactory {
	
	public ItemProtocolo createItemProtocolo(String item) throws Exception;

}
