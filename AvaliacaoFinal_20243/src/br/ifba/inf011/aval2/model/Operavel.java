package br.ifba.inf011.aval2.model;

public interface Operavel {
	
	public String dump();
	public String ler(Credencial credencial) throws IllegalAccessException;
	public void escrever(Credencial credencial, String escrever) throws IllegalAccessException;
	public void bloquear() throws UnsupportedOperationException;
	public void somenteLeitura() throws UnsupportedOperationException;
	public void excluir() throws UnsupportedOperationException;
	public void recuperar() throws UnsupportedOperationException;
	public void liberar() throws UnsupportedOperationException;

}
