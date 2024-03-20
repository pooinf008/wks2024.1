package br.ifba.inf011.model;

//PRODUCT em FACTORY METHOD
public interface Protocolo {
	
	public void open();
	public void message(MessageRequest request, MessageResponse response);	
	public void close();
	

}
