package br.ifba.inf011.solid.model.service;

import java.math.BigDecimal;

import br.ifba.inf011.solid.exception.RHException;
import br.ifba.inf011.solid.model.Cargo;

public interface Reajustavel {
	public void reajustar(BigDecimal novoSalario)throws RHException;
	public Cargo getCargo();
	public String getNome();
	public BigDecimal getSalario();

}
