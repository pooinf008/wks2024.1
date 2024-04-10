package br.ifba.inf011.model;

import br.ifba.inf011.model.prototype.Prototype;

public interface Mensageiro<T> extends Prototype{
	
	public void modificarTransporte(TransporteProtocolo transporte);
	public void enviar(T  conteudo) throws Exception ; 

}
