package br.ifba.inf011.model;

import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;

public class Aplicacao {
	
	
	public void run(TipoProtocolo tipo) {
		
		if(tipo == TipoProtocolo.HTTP) {
			HTTPProtocolo http = new HTTPProtocolo();
			HTTPMessageRequest request = new HTTPMessageRequest();
			HTTPMessageResponse response = new HTTPMessageResponse();
			http.openHTTP();
			request.addHeader("MESSAGE", "GET");
			http.messageHTTP(request, response);
			http.closeHTTP();
		}else if(tipo == TipoProtocolo.FTP) {
			FTPProtocolo ftp = new FTPProtocolo();
			FTPMessageRequest request = new FTPMessageRequest();
			FTPMessageResponse response = new FTPMessageResponse();
			ftp.openFTP();
			request.addHeader("MESSAGE", "GET");
			ftp.messageFTP(request, response);
			ftp.closeFTP();
		}else
			System.out.println("NÃO SUPORTADO");
		
	}
	
	public static void main(String[] args) {
		(new Aplicacao()).run(TipoProtocolo.FTP);
	}
	
	

}
