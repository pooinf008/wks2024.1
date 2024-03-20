package br.ifba.inf011.model.protocolos.safety;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;


//CONCRETEPRODUCT em FACTORY METHOD
public class SafetyProtocolo implements Protocolo{
	
	public static Integer PORT_DEFAULT = 99;
	public static String HOST_DEFAULT = "safety.host.com";	
	
	private Integer port;
	private String  host;
	
	
	public SafetyProtocolo() {
		this(SafetyProtocolo.HOST_DEFAULT, SafetyProtocolo.PORT_DEFAULT);
	}	

	public SafetyProtocolo(Integer port) {
		this(SafetyProtocolo.HOST_DEFAULT, port);
	}
	
	public SafetyProtocolo(String  host) {
		this(host, SafetyProtocolo.PORT_DEFAULT);
	}
	
	public SafetyProtocolo(String  host, Integer port) {
		this.host = host;
		this.port = port;
	}
	
	public void open() {
		System.out.println("Abrindo conexão Safety em safety://" + this.host + ":" + this.port + "...");
	}
	
	
	public void message(MessageRequest request, MessageResponse response) {
		System.out.println("Enviando SafetyMessage: " + request);
		response.addHeader("HOST", this.host);
		response.addHeader("PORT", String.valueOf(this.port));
	}	
	
	
	public void close() {
		System.out.println("Fechando conexão Safety em safety://" + this.host + ":" + this.port + "...");
	}
		
	
	
	
	

}


