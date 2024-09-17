package br.ifba.inf011.aval2.model.state;

import br.ifba.inf011.aval2.model.Credencial;

public interface ArquivoState {
	public ArquivoState bloquear() throws UnsupportedOperationException;
	public ArquivoState somenteLeitura() throws UnsupportedOperationException;
	public ArquivoState excluir() throws UnsupportedOperationException;
	public ArquivoState recuperar() throws UnsupportedOperationException;
	public ArquivoState liberar() throws UnsupportedOperationException;
	public String ler(Credencial credencial, String conteudo) throws IllegalAccessException;
	public String escrever(Credencial credencial, String conteudo) throws IllegalAccessException;
	public Long getTamanho(String conteudo) throws IllegalAccessException;

	
}
