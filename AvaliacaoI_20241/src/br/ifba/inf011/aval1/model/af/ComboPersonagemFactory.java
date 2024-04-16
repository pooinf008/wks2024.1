package br.ifba.inf011.aval1.model.af;

import br.ifba.inf011.aval1.model.builder.ArmaBuilder;
import br.ifba.inf011.aval1.model.builder.PersonagemBuilder;

public interface ComboPersonagemFactory {
	
	public ArmaBuilder getArmaBuilder();
	public PersonagemBuilder getPersonagemBuilder();

}
