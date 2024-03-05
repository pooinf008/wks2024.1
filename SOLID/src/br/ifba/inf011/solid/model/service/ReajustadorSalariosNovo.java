package br.ifba.inf011.solid.model.service;

import java.math.BigDecimal;

import br.ifba.inf011.solid.model.Cargo;
import br.ifba.inf011.solid.model.Funcionario;

public class ReajustadorSalariosNovo extends ReajustadorSalarios{

	public boolean podeReajustar(Funcionario funcionario, BigDecimal percentual) {
		if (percentual.compareTo(new BigDecimal(0.3)) < 0 && funcionario.getCargo() != Cargo.JUNIOR)
			return true;
		return (percentual.compareTo(new BigDecimal(0.1)) < 0); 	
	}
	
}
