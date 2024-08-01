package br.ifba.inf011.aval2.model;

import java.time.LocalDate;
import java.util.List;

import br.ifba.inf011.aval2.model.composite.AbstractEntrada;

public class Arquivo extends AbstractEntrada implements EntradaLegivel{
	
	private Long tamanho;

	public Arquivo(String nome, LocalDate dataCriacao, Long tamanho) {
		super(nome, dataCriacao);
		this.tamanho = tamanho;
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
	public Long getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public String ler(Credencial credencial) {
		return credencial.getId() + " lendo entrada: " + this.getNome();
	}	
	

}
