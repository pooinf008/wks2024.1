package br.ifba.inf011.model.protocolos.ftp;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;

public class FTPProtocolo implements Protocolo{
	
	public static Integer PORT_DEFAULT = 21;
	public static String HOST_DEFAULT = "ftp.host.com";	
	
	private Integer port;
	private String  host;
	
	
	public FTPProtocolo() {
		this(FTPProtocolo.HOST_DEFAULT, FTPProtocolo.PORT_DEFAULT);
	}	

	public FTPProtocolo(Integer port) {
		this(FTPProtocolo.HOST_DEFAULT, port);
	}
	
	public FTPProtocolo(String  host) {
		this(host, FTPProtocolo.PORT_DEFAULT);
	}
	
	public FTPProtocolo(String  host, Integer port) {
		this.host = host;
		this.port = port;
	}
	
	public void open() {
		System.out.println("Abrindo conexão FTP em ftp://" + this.host + ":" + this.port + "...");
	}
	
	
	public void message(MessageRequest request, MessageResponse response) {
		System.out.println("Enviando FTPMessage: " + request);
		response.addHeader("HOST", this.host);
		response.addHeader("PORT", String.valueOf(this.port));
	}	
	
	
	public void close() {
		System.out.println("Fechando conexão FTP em ftp://" + this.host + ":" + this.port + "...");
	}
		
	
	
	
	

}


