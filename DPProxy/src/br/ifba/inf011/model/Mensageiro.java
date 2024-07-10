package br.ifba.inf011.model;

public interface Mensageiro {
	public void enviar(String  conteudo) throws Exception ; 
	public void enviarBroadcast(String  conteudo) throws Exception ;	
}
