package br.ifba.inf011.solid.model.service;

import java.math.BigDecimal;
import java.util.List;

import br.ifba.inf011.solid.exception.RHException;
import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.service.regras.Regra;

public class OCPReajustadorSalarios implements Reajustador{
	
	private List<Regra> regras;
	
	
	public OCPReajustadorSalarios(List<Regra> regras) {
		this.regras = regras;
	}
	
	
	public void reajustar(Reajustavel funcionario, BigDecimal percentual) throws RHException {
		
		this.podeReajustar(funcionario, percentual);
		
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal  reajuste = funcionario.getSalario().multiply(percentual);
		BigDecimal novoSalario = salarioAtual.add(reajuste);
		funcionario.reajustar(novoSalario);
	}

	private void podeReajustar(Reajustavel funcionario, BigDecimal percentual) throws RHException {
		for(Regra regra : this.regras)
			if(!regra.aplicavel(funcionario, percentual))
				throw new  RHException("Não é possível aplicar este aumento a este funcionario") ;
		return; 
	}
	
	

}
