package br.ifba.inf011.aval1.model.builder;

import java.util.ArrayList;

import br.ifba.inf011.aval1.model.Arma;
import br.ifba.inf011.aval1.model.Personagem;
import br.ifba.inf011.aval1.model.SoldadoGuerraSecessao;

public class SoldadoGuerraSecessaoBuilder extends AbstractPersonagemBuilder{

	@Override
	public void reset() {
		this.ataqueRapido = 15.0;
		this.ataqueForca = 30.0; 
		this.ataqueEspecial = 75.0;
		this.defesa = 150.0;
		this.moedas = 200.0; 
		this.habilidade = false;
		this.armas = new ArrayList<Arma>();		
	}

	@Override
	public void addArma(Arma arma) {
		this.armas.add(arma);
	}
	
	public Personagem getPersonagem() {
		return new SoldadoGuerraSecessao(this.ataqueRapido, this.ataqueForca, this.ataqueEspecial, this.defesa, 
						   			  		this.moedas, this.habilidade, this.armas);
	}

	
}
