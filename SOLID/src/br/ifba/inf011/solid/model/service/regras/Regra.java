package br.ifba.inf011.solid.model.service.regras;

import java.math.BigDecimal;

import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.service.Reajustavel;

public interface Regra {

	public  boolean aplicavel(Reajustavel funcionario, BigDecimal percentual);

}
