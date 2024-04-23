package br.ifba.inf011.model.adapter;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.Conteudo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.TransporteProtocolo;
import br.ifba.inf011.model.externo.ClosedProtocol;
import br.ifba.inf011.model.externo.Listener;

public class ObjectClosedProtocolAdapter 
		implements AplicacaoProtocolo, MessageRequest {

	private ClosedProtocol protocolo;
	private char[] conteudo;
	private Listener listener;
	
	public ObjectClosedProtocolAdapter(ClosedProtocol protocolo, 
									   String host, Integer porta) {
		this.protocolo = protocolo;
		this.listener = new Listener(host, porta);
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
	}

	@Override
	public void message(MessageRequest request, MessageResponse response) {
		this.protocolo.deliver(this.listener, this.conteudo);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setTransporte(TransporteProtocolo protocolo) {
		// TODO Auto-generated method stub
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
