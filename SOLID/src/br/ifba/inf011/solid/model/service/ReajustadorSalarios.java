package br.ifba.inf011.solid.model.service;

import java.math.BigDecimal;

import br.ifba.inf011.solid.exception.RHException;
import br.ifba.inf011.solid.model.Funcionario;

public class ReajustadorSalarios implements Reajustador{
	
	
	public void reajustar(Reajustavel funcionario, BigDecimal percentual) throws RHException {
		
		if(!this.podeReajustar(funcionario, percentual))
			throw new RHException("Percentual de Aumento Invalido");
		
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal  reajuste = funcionario.getSalario().multiply(percentual);
		BigDecimal novoSalario = salarioAtual.add(reajuste);
		funcionario.reajustar(novoSalario);
	}
	
	public boolean podeReajustar(Reajustavel funcionario, BigDecimal percentual) {
		return !(percentual.compareTo(new BigDecimal(0.3)) > 0);	
	}


	

}
