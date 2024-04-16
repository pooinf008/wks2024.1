package br.ifba.inf011.aval1.model.builder;

import java.util.ArrayList;

import br.ifba.inf011.aval1.model.Arma;
import br.ifba.inf011.aval1.model.Personagem;
import br.ifba.inf011.aval1.model.SoldadoGuerraGolfo;

public class SoldadoGuerraGolfoBuilder extends AbstractPersonagemBuilder{

	@Override
	public void reset() {
		this.ataqueRapido = 10.0;
		this.ataqueForca = 20.0; 
		this.ataqueEspecial = 50.0;
		this.defesa = 200.0;
		this.moedas = 1000.0; 
		this.habilidade = false;
		this.armas = new ArrayList<Arma>();		
	}

	@Override
	public void addArma(Arma arma) {
		this.armas.add(arma);
	}
	
	public Personagem getPersonagem() {
		return new SoldadoGuerraGolfo(this.ataqueRapido, this.ataqueForca, this.ataqueEspecial, this.defesa, 
						   			  this.moedas, this.habilidade, this.armas);
	}

	
}
