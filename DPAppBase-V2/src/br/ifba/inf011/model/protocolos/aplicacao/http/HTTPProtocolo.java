package br.ifba.inf011.model.protocolos.aplicacao.http;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractAplicacaoProtocolo;

public class HTTPProtocolo extends AbstractAplicacaoProtocolo implements AplicacaoProtocolo {

	public static Integer PORT_DEFAULT = 80;
	public static String HOST_DEFAULT = "http.host.com";	
	
	
	public HTTPProtocolo() {
		super(HTTPProtocolo.HOST_DEFAULT, HTTPProtocolo.PORT_DEFAULT);
	}	

	public HTTPProtocolo(Integer port) {
		super(HTTPProtocolo.HOST_DEFAULT, port);
	}
	
	public HTTPProtocolo(String  host) {
		super(host, HTTPProtocolo.PORT_DEFAULT);
	}
	
	public HTTPProtocolo(String  host, Integer port) {
		super(host, port);
	}

	@Override
	protected String getURINome() {
		return "http";
	}

	@Override
	protected String getNome() {
		return "HTTP";
	}

} 

