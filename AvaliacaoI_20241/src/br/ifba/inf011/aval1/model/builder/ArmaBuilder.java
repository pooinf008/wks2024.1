package br.ifba.inf011.aval1.model.builder;

import br.ifba.inf011.aval1.model.Arma;

public interface ArmaBuilder {
	public void reset();
	public void habilitar();
	public Arma getArma();
}
