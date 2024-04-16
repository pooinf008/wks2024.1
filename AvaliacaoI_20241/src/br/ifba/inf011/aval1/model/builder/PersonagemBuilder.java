package br.ifba.inf011.aval1.model.builder;

import br.ifba.inf011.aval1.model.Arma;
import br.ifba.inf011.aval1.model.Personagem;

public interface PersonagemBuilder {
	public void reset();
	public Personagem getPersonagem();
	public void addArma(Arma arma);
}
