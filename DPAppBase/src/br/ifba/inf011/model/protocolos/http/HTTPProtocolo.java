package br.ifba.inf011.model.protocolos.http;

public class HTTPProtocolo {
	
	public static Integer PORT_DEFAULT = 80;
	public static String HOST_DEFAULT = "http.host.com";	
	
	private Integer port;
	private String  host;
	
	
	public HTTPProtocolo() {
		this(HTTPProtocolo.HOST_DEFAULT, HTTPProtocolo.PORT_DEFAULT);
	}	

	public HTTPProtocolo(Integer port) {
		this(HTTPProtocolo.HOST_DEFAULT, port);
	}
	
	public HTTPProtocolo(String  host) {
		this(host, HTTPProtocolo.PORT_DEFAULT);
	}
	
	public HTTPProtocolo(String  host, Integer port) {
		this.host = host;
		this.port = port;
	}
	
	public void openHTTP() {
		System.out.println("Abrindo conexão HTTP em http://" + this.host + ":" + this.port + "...");
	}
	
	
	public void messageHTTP(HTTPMessageRequest request, HTTPMessageResponse response) {
		System.out.println("Enviando HTTPMessage: " + request);
		response.addHeader("HOST", this.host);
		response.addHeader("PORT", String.valueOf(this.port));
	}	
	
	
	public void closeHTTP() {
		System.out.println("Fechando conexão HTTP em http://" + this.host + ":" + this.port + "...");
	}
		
	
	
	
	

}


