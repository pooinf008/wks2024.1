package br.ifba.inf011.model;

public interface MessageRequest{
	public void addHeader(String key, String value);
	public void setBody(String body);
	public void setBody(Conteudo body);
	public char[] getBody();
}
