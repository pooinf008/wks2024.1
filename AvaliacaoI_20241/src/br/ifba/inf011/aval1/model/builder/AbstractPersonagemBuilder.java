package br.ifba.inf011.aval1.model.builder;

import java.util.List;

import br.ifba.inf011.aval1.model.Arma;

public abstract class AbstractPersonagemBuilder implements PersonagemBuilder{
	
	protected Double ataqueRapido;
	protected Double ataqueForca; 
	protected Double ataqueEspecial;
	protected Double defesa;
	protected Double moedas; 
	protected Boolean habilidade;
	protected List<Arma> armas;
	
	

}
