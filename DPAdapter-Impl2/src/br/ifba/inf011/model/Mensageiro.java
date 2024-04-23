package br.ifba.inf011.model;

public interface Mensageiro<T> {
	
	public void enviar(T  conteudo) throws Exception ; 

}
