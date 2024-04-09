package br.ifba.inf011.model;

public interface AplicacaoProtocolo{
	
	public void open();
	public void message(MessageRequest request, MessageResponse response);	
	public void close();
	public void setTransporte(TransporteProtocolo protocolo);
	
}
