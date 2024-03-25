package br.ifba.inf011.model;

public interface MessageResponse{
	public void addHeader(String key, String value);
	public void setBody(String body);
	public char[] getBody();
}
