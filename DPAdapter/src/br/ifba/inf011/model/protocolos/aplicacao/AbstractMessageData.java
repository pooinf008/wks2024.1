package br.ifba.inf011.model.protocolos.aplicacao;

import br.ifba.inf011.model.Conteudo;
import br.ifba.inf011.model.MessageRequest;

public abstract class AbstractMessageData implements MessageRequest{

	private MessageData data;


	public AbstractMessageData() {
		this.data = new MessageData();
	}
	
	public void addHeader(String key, String value) {
		this.data.addHeader(key, value);
	}
	
	public void setBody(String body) {
		this.data.setBody(new Conteudo(body));
	}	
	
	public void setBody(Conteudo body) {
		this.data.setBody(body);
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getNome() + "\n");
		buffer.append(this.data.toString());
		return buffer.toString();
	}

	protected abstract String getNome();

	@Override
	public char[] getBody() {
		return this.data.getBody();
	}	
	
}
