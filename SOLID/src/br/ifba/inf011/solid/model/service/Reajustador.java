package br.ifba.inf011.solid.model.service;

import java.math.BigDecimal;

import br.ifba.inf011.solid.exception.RHException;

public interface Reajustador {
	
	public void reajustar(Reajustavel reajustavel,
						  BigDecimal percentual) throws RHException;
}
