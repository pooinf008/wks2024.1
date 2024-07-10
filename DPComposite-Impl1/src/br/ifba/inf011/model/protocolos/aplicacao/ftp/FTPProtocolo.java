package br.ifba.inf011.model.protocolos.aplicacao.ftp;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractAplicacaoProtocolo;
import br.ifba.inf011.model.protocolos.aplicacao.http.HTTPProtocolo;

public class FTPProtocolo extends AbstractAplicacaoProtocolo implements AplicacaoProtocolo {

	public static Integer PORT_DEFAULT = 21;
	public static String HOST_DEFAULT = "ftp.host.com";	
	
	
	public FTPProtocolo() {
		super(FTPProtocolo.HOST_DEFAULT, HTTPProtocolo.PORT_DEFAULT);
	}	

	public FTPProtocolo(Integer port) {
		super(FTPProtocolo.HOST_DEFAULT, port);
	}
	
	public FTPProtocolo(String  host) {
		super(host, FTPProtocolo.PORT_DEFAULT);
	}
	
	public FTPProtocolo(String  host, Integer port) {
		super(host, port);
	}

	@Override
	protected String getURINome() {
		return "ftp";
	}

	@Override
	protected String getNome() {
		return "FTP";
	}

} 
