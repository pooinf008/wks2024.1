package br.ifba.inf011.aval2.model;

import java.time.LocalDate;
import java.util.List;

import br.ifba.inf011.aval2.model.composite.AbstractEntrada;

public class Arquivo extends AbstractEntrada implements EntradaOperavel{
	
	private String conteudo;

	public Arquivo(String nome, LocalDate dataCriacao, String conteudo) {
		super(nome, dataCriacao);
		this.conteudo =  conteudo;
	}

	@Override
	public List<Entrada> getFilhos() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	@Override
	public void addFilho(Entrada entrada) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeFilho(Entrada entrada) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	@Override
	public Long getTamanho() throws IllegalAccessException{
		return Long.valueOf(this.conteudo.length());
	}
	
	@Override
	public String ler(Credencial credencial) throws IllegalAccessException{
		return this.conteudo;
	}

	@Override
	public void escrever(Credencial credencial, String conteudo) throws IllegalAccessException {
		this.conteudo = conteudo; 
	}

	@Override
	public String dump(){
		return this.conteudo;
	};

	protected void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
