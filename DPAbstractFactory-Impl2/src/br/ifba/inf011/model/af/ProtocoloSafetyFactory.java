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
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;
import br.ifba.inf011.model.protocolos.safety.SafetyCredencial;
import br.ifba.inf011.model.protocolos.safety.SafetyMessageRequest;
import br.ifba.inf011.model.protocolos.safety.SafetyMessageResponse;
import br.ifba.inf011.model.protocolos.safety.SafetyProtocolo;
import br.ifba.inf011.model.protocolos.telnet.TelnetMessageRequest;
import br.ifba.inf011.model.protocolos.telnet.TelnetMessageResponse;
import br.ifba.inf011.model.protocolos.telnet.TelnetProtocolo;

public class ProtocoloSafetyFactory implements ProtocoloAbstractFactory{
	
	public ItemProtocolo createItemProtocolo(String item) throws Exception {
		if(item.equalsIgnoreCase("MessageResponse"))
			return new SafetyMessageResponse();
		else if(item.equalsIgnoreCase("MessageRequest"))
			return new SafetyMessageRequest();
		else if (item.equalsIgnoreCase("Protocolo"))
			return new SafetyProtocolo();
		else if (item.equalsIgnoreCase("Credencial"))
			return new SafetyCredencial();
		else
			throw new Exception("ItemIndefinido"); 
	};		
	
}
