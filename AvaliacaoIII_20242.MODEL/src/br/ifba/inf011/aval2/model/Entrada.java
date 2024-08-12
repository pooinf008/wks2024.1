package br.ifba.inf011.aval2.model;

import java.time.LocalDate;
import java.util.List;


public interface Entrada {

	public String getNome();
	public LocalDate getDataCriacao();
	public Long getTamanho() throws IllegalAccessException;
	public List<Entrada> getFilhos() throws UnsupportedOperationException;
	public void addFilho(Entrada entrada) throws UnsupportedOperationException;
	public void removeFilho(Entrada entrada) throws UnsupportedOperationException;
	
	
}
