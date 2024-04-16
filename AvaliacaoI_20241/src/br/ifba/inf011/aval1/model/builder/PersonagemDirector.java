package br.ifba.inf011.aval1.model.builder;

import br.ifba.inf011.aval1.model.Arma;

public class PersonagemDirector {
	
	private PersonagemBuilder personagemBuilder;
	private ArmaBuilder armaBuilder;
	
	public PersonagemDirector(PersonagemBuilder personagemBuilder, ArmaBuilder armaBuilder) {
		this.personagemBuilder = personagemBuilder;
		this.armaBuilder = armaBuilder;
	}
	
	public void criarStarter() {
		this.armaBuilder.reset();
		this.armaBuilder.habilitar();
		Arma arma = this.armaBuilder.getArma();
		this.personagemBuilder.reset();
		this.personagemBuilder.addArma(arma);
	}
	

}
