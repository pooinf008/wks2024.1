package br.ifba.inf011.aval2.model.state;

import br.ifba.inf011.aval2.model.Credencial;

public class AbstractArquivoState implements ArquivoState{

	@Override
	public ArquivoState bloquear() throws UnsupportedOperationException {
		return this;
	}

	@Override
	public ArquivoState somenteLeitura() throws UnsupportedOperationException {
		return this;
	}

	@Override
	public ArquivoState excluir() throws UnsupportedOperationException {
		return this;
	}

	@Override
	public ArquivoState recuperar() throws UnsupportedOperationException {
		return this;
	}

	@Override
	public ArquivoState liberar() throws UnsupportedOperationException {
		return this;
	}

	@Override
	public String ler(Credencial credencial, String conteudo) throws  IllegalAccessException {
		throw new IllegalAccessException("A operação de leitura do arquivo não é possível"); 
	}

	@Override
	public String escrever(Credencial credencial, String conteudo) throws IllegalAccessException {
		throw new IllegalAccessException("A operação de escrita no arquivo não é possível");
	}

	@Override
	public Long getTamanho(String conteudo) throws IllegalAccessException {
		throw new IllegalAccessException("Erro lendo o tamanho do arquivo");
	}

	
	

}
