package br.ifba.inf011.aval1.model.af;

import br.ifba.inf011.aval1.model.builder.ArmaBuilder;
import br.ifba.inf011.aval1.model.builder.MetralhadoraBuilder;
import br.ifba.inf011.aval1.model.builder.PersonagemBuilder;
import br.ifba.inf011.aval1.model.builder.SoldadoGuerraGolfoBuilder;

public class StarterGuerraGolfoFactory implements ComboPersonagemFactory {

	@Override
	public ArmaBuilder getArmaBuilder() {
		return new MetralhadoraBuilder();
	}

	@Override
	public PersonagemBuilder getPersonagemBuilder() {
		return new SoldadoGuerraGolfoBuilder();
	}

}
