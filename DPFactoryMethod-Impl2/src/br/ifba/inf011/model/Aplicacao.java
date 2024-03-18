package br.ifba.inf011.model;

import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;

public class Aplicacao {
	
	
	public void send(TipoProtocolo tipo) {
		Protocolo protocolo = this.createProtocolo(tipo);
		MessageRequest request = this.createRequest(tipo);
		MessageResponse response = this.createResponse(tipo);
		protocolo.open();
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	protected MessageResponse createResponse(TipoProtocolo tipo) {
		if(tipo == TipoProtocolo.FTP)
			return new FTPMessageResponse();
		else if(tipo == TipoProtocolo.HTTP)
			return new HTTPMessageResponse();
		else
			return null;
	};

	protected MessageRequest createRequest(TipoProtocolo tipo) {
		if(tipo == TipoProtocolo.FTP)
			return new FTPMessageRequest();
		else if(tipo == TipoProtocolo.HTTP)
			return new HTTPMessageRequest();
		else
			return null;		
	};

	protected Protocolo createProtocolo(TipoProtocolo tipo) {
		if(tipo == TipoProtocolo.FTP)
			return new FTPProtocolo();
		else if(tipo == TipoProtocolo.HTTP)
			return new HTTPProtocolo();
		else
			return null;		
	};

	public static void main(String[] args) {
		(new Aplicacao()).send(TipoProtocolo.HTTP);
	}	
	
	

}
