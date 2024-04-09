package br.ifba.inf011.model.protocolos.aplicacao;

import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.model.Conteudo;
import br.ifba.inf011.model.prototype.Prototype;

public class MessageData implements Prototype{
	
	private Map<String, String> header;
	private Conteudo body;
	
	public MessageData(MessageData messageData) {
		this.header = new HashMap<String, String>(messageData.header);
		this.body =  (Conteudo)(messageData.body).prototipar();
	}

	public MessageData() {
		this.header = new HashMap<String, String>();
	}

	public void addHeader(String key, String value) {
		this.header.put(key, value);		
	}
	
	public void setBody(Conteudo body) {
		this.body = body;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(String key : this.header.keySet())
			buffer.append(key + ": " + this.header.get(key) + "\n");
		if(this.body != null)
			buffer.append(this.body.toString());
		return buffer.toString();
	}
	
	public char[] getBody() {
		return this.body.asCharArray();
	}

	@Override
	public Prototype prototipar() {
		return new MessageData(this);
	}	
	
		
	
	
}