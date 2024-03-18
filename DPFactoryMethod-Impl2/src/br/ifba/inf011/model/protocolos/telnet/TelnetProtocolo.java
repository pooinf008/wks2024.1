package br.ifba.inf011.model.protocolos.telnet;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;

public class TelnetProtocolo implements Protocolo {
	
	public static Integer PORT_DEFAULT = 23;
	public static String HOST_DEFAULT = "telnet.host.com";	
	
	private Integer port;
	private String  host;
	
	
	public TelnetProtocolo() {
		this(TelnetProtocolo.HOST_DEFAULT, TelnetProtocolo.PORT_DEFAULT);
	}	

	public TelnetProtocolo(Integer port) {
		this(TelnetProtocolo.HOST_DEFAULT, port);
	}
	
	public TelnetProtocolo(String  host) {
		this(host, TelnetProtocolo.PORT_DEFAULT);
	}
	
	public TelnetProtocolo(String  host, Integer port) {
		this.host = host;
		this.port = port;
	}
	
	public void open() {
		System.out.println("Abrindo conexão TELNET em telnet://" + this.host + ":" + this.port + "...");
	}
	
	
	public void message(MessageRequest request, MessageResponse response) {
		System.out.println("Enviando TelnetMessage: " + request);
		response.addHeader("HOST", this.host);
		response.addHeader("PORT", String.valueOf(this.port));
	}	
	
	
	public void close() {
		System.out.println("Fechando conexão Telnet em telnet://" + this.host + ":" + this.port + "...");
	}
		
	
	
	
	

}


