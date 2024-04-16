package br.ifba.inf011.aval1.model.builder;

import br.ifba.inf011.aval1.model.Arma;
import br.ifba.inf011.aval1.model.Metralhadora;

public class MetralhadoraBuilder extends AbstractArmaBuilder implements ArmaBuilder{

	@Override
	public void reset() {
		this.danoAdicionalRapido = 15.0;
		this.danoAdicionalForca = 20.0; 
		this.danoAdicionalEspecial = 30.0;
		this.habilitada = false;
		
	}

	@Override
	public void habilitar() {
		this.habilitada = true;		
	}

	@Override
	public Arma getArma() {
		return new Metralhadora(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial, this.habilitada);
	}

}
