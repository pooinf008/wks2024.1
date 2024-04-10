package br.ifba.inf011.model;

import br.ifba.inf011.model.prototype.Prototype;

public interface MessageRequest extends Prototype{
	public void addHeader(String key, String value);
	public void setBody(String body);
	public void setBody(Conteudo body);
	public char[] getBody();
}
