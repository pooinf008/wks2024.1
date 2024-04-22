package br.ifba.inf011.model.adapter;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.Conteudo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.TransporteProtocolo;
import br.ifba.inf011.model.externo.ClosedProtocol;
import br.ifba.inf011.model.externo.Listener;

public class ClosedProtocolAdapter implements AplicacaoProtocolo, MessageRequest, MessageResponse {

	
	private ClosedProtocol protocol;
	private char[] conteudo;  
	private Listener listener;
	
	
	public ClosedProtocolAdapter(ClosedProtocol protocol, String host, Integer porta) {
		this.protocol = protocol;
		this.listener = new Listener(host, porta);
		
	}
	
	
	@Override
	public void open() {
	}

	@Override
	public void message(MessageRequest request, MessageResponse response) {
		this.protocol.send(this.listener, this.conteudo);
	}

	@Override
	public void close() {
	}

	@Override
	public void setTransporte(TransporteProtocolo protocolo) {
	}


	@Override
	public void addHeader(String key, String value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setBody(String body) {
		this.conteudo = body.toCharArray();
	}


	@Override
	public void setBody(Conteudo body) {
		this.conteudo = body.asCharArray();
	}


	@Override
	public char[] getBody() {
		return this.conteudo;
	}

}
