package br.ifba.inf011.model.af;

import br.ifba.inf011.model.ItemProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;

public class ProtocoloFTPFactory implements ProtocoloAbstractFactory{
	
	public ItemProtocolo createItemProtocolo(String item) throws Exception {
		if(item.equalsIgnoreCase("MessageResponse"))
			return new FTPMessageResponse();
		else if(item.equalsIgnoreCase("MessageRequest"))
			return new FTPMessageRequest();
		else if (item.equalsIgnoreCase("Protocolo"))
			return new FTPProtocolo();
		else
			throw new Exception("ItemIndefinido"); 
	};
	
	

}
