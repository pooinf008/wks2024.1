package br.ifba.inf011.solid.model.service.regras;

import java.math.BigDecimal;

import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.service.Reajustavel;

public class RegraReajusteMax30 implements Regra{

	@Override
	public boolean aplicavel(Reajustavel funcionario, BigDecimal percentual) {
		return percentual.compareTo(new BigDecimal(0.3)) < 0;
	}

}
