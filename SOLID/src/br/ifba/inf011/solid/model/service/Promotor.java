package br.ifba.inf011.solid.model.service;

import br.ifba.inf011.solid.exception.RHException;

public class Promotor {
	
	public void promover(Promovivel promovivel) throws RHException {
		
		//verifica se a promocao e possivel
		
		promovivel.promover();
	}

}
