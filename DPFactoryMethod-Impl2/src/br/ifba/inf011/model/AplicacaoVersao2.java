package br.ifba.inf011.model;

import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;
import br.ifba.inf011.model.protocolos.telnet.TelnetMessageRequest;
import br.ifba.inf011.model.protocolos.telnet.TelnetMessageResponse;
import br.ifba.inf011.model.protocolos.telnet.TelnetProtocolo;

public class AplicacaoVersao2 extends Aplicacao{

	protected MessageResponse createResponse(TipoProtocolo tipo) { 	
		if(tipo == TipoProtocolo.TELNET)
			return new TelnetMessageResponse();
		else
			return super.createResponse(tipo);		
	}
	
	
	protected MessageRequest createRequest(TipoProtocolo tipo) {
		if(tipo == TipoProtocolo.TELNET)
			return new TelnetMessageRequest();
		else
			return super.createRequest(tipo);		
	}
	
	
	protected Protocolo createProtocolo(TipoProtocolo tipo) {
		if(tipo == TipoProtocolo.TELNET)
			return new TelnetProtocolo();
		else
			return super.createProtocolo(tipo);		
	};	
	
	
	public static void main(String[] args) {
		(new AplicacaoVersao2()).send(TipoProtocolo.HTTP);
	}	
	
}
