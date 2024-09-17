package br.ifba.inf011.aval2.model.composite;

import java.time.LocalDate;
import java.util.Objects;


public class AbstractEntrada {
	private String nome;
	private LocalDate dataCriacao;
	
	public AbstractEntrada(String nome, LocalDate dataCriacao) {
		super();
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntrada other = (AbstractEntrada) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

	
	
}

