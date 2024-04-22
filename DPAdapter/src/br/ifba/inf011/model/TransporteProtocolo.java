package br.ifba.inf011.model;

public interface TransporteProtocolo {
	
	public void send(char[] conteudo);
	public void open();
	public void close();

}
