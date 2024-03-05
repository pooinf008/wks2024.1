package br.ifba.inf011.solid.model.service.regras;

import java.math.BigDecimal;

import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.service.Reajustavel;

public class RegraReajusteLetra implements Regra{
	
	private Character letra;
	
	public RegraReajusteLetra(Character letra){
		this.letra = letra;
		
	}
	

	@Override
	public boolean aplicavel(Reajustavel funcionario, BigDecimal percentual) {
		return funcionario.getNome().startsWith(this.letra.toString());
	}
	
	public Character startsWith() {
		return this.letra;
	}

}
