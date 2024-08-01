package br.ifba.inf011.aval2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.ifba.inf011.aval2.model.composite.AbstractEntrada;

public class Pasta extends AbstractEntrada implements Entrada{
	
	private List<Entrada> filhos;
	
	public Pasta(String nome, LocalDate dataCriacao) {
		super(nome, dataCriacao);
		this.filhos = new ArrayList<Entrada>();
	}	
	
	public List<Entrada> getFilhos() throws UnsupportedOperationException{
		return filhos;
	}
	
	public void addFilho(Entrada entrada) throws UnsupportedOperationException{
		this.filhos.add(entrada);
	}
	
	public void removeFilho(Entrada entrada) throws UnsupportedOperationException{
		this.filhos.remove(entrada);
	}

	@Override
	public Long getTamanho() {
		Long tamanho = 0L;
		for(Entrada entrada : this.getFilhos())
			tamanho += entrada.getTamanho();
		return tamanho;
	}
	


}
