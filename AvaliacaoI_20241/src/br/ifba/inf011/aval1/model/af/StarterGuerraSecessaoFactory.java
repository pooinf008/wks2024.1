package br.ifba.inf011.aval1.model.af;

import br.ifba.inf011.aval1.model.builder.ArmaBuilder;
import br.ifba.inf011.aval1.model.builder.BacamarteBuilder;
import br.ifba.inf011.aval1.model.builder.PersonagemBuilder;
import br.ifba.inf011.aval1.model.builder.SoldadoGuerraSecessaoBuilder;

public class StarterGuerraSecessaoFactory implements ComboPersonagemFactory {

	@Override
	public ArmaBuilder getArmaBuilder() {
		return new BacamarteBuilder();
	}

	@Override
	public PersonagemBuilder getPersonagemBuilder() {
		return new SoldadoGuerraSecessaoBuilder();
	}

}
