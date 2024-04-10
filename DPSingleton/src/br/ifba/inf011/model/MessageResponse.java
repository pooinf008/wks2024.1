package br.ifba.inf011.model;

import br.ifba.inf011.model.prototype.Prototype;

public interface MessageResponse{
	public void addHeader(String key, String value);
	public void setBody(String body);
	public char[] getBody();
	public Prototype prototipar();
}
