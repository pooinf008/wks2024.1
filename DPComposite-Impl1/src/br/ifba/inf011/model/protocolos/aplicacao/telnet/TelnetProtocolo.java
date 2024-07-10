package br.ifba.inf011.model.protocolos.aplicacao.telnet;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.protocolos.aplicacao.AbstractAplicacaoProtocolo;

public class TelnetProtocolo extends AbstractAplicacaoProtocolo implements AplicacaoProtocolo {
	
	public static Integer PORT_DEFAULT = 23;
	public static String HOST_DEFAULT = "telnet.host.com";	
	
	
	public TelnetProtocolo() {
		super(TelnetProtocolo.HOST_DEFAULT, TelnetProtocolo.PORT_DEFAULT);
	}	

	public TelnetProtocolo(Integer port) {
		super(TelnetProtocolo.HOST_DEFAULT, port);
	}
	
	public TelnetProtocolo(String  host) {
		super(host, TelnetProtocolo.PORT_DEFAULT);
	}
	
	public TelnetProtocolo(String  host, Integer port) {
		super(host, port);
	}

	@Override
	protected String getURINome() {
		return "telnet";
	}

	@Override
	protected String getNome() {
		return "TELNET";
	}
	
	
	
	

}


