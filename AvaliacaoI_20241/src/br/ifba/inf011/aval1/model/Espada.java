package br.ifba.inf011.aval1.model;

public class Espada implements Arma {
	
	
	public Espada(Double danoAdicionalRapido,
				  Double danoAdicionalForca,
				  Double danoAdicionalEspecial,
				  Boolean habilitada) {
		
	}
	

	@Override
	public Double getAdicionalRapido() {
		return 0.0;
	}

	@Override
	public Double getAdicionalForca() {
		return 0.0;
	}

	@Override
	public Double getAdicionalEspecial() {
		return 0.0;
	}

	@Override
	public Boolean habilitada() {
		return true;
	}
	
	public String toString() {
		return "espada.";
	}

}
