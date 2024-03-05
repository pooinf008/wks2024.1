package br.ifba.inf011.solid.model.service.regras;

import java.math.BigDecimal;

import br.ifba.inf011.solid.model.Cargo;
import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.service.Reajustavel;

public class RegraReajusteJunior15 implements Regra{

	@Override
	public boolean aplicavel(Reajustavel funcionario, BigDecimal percentual) {
		return !funcionario.getCargo().equals(Cargo.JUNIOR) ||
			    percentual.compareTo(new BigDecimal(0.15)) < 0;
	}


}
