package br.ifba.inf011.aval1.model.af;

import br.ifba.inf011.aval1.model.builder.ArmaBuilder;
import br.ifba.inf011.aval1.model.builder.CruzadoBuilder;
import br.ifba.inf011.aval1.model.builder.EspadaBuilder;
import br.ifba.inf011.aval1.model.builder.PersonagemBuilder;

public class StarterMedievalFactory implements ComboPersonagemFactory {

	@Override
	public ArmaBuilder getArmaBuilder() {
		return new EspadaBuilder();
	}

	@Override
	public PersonagemBuilder getPersonagemBuilder() {
		return new CruzadoBuilder();
	}

}
