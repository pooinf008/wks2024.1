package br.ifba.inf011.model;

import br.ifba.inf011.model.prototype.Prototype;

public interface AplicacaoProtocolo extends Prototype{
	
	public void open();
	public void message(MessageRequest request, MessageResponse response);	
	public void close();
	public void setTransporte(TransporteProtocolo protocolo);
	
}
