package br.ifba.inf011.model.singleton;

import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.model.Mensageiro;
import br.ifba.inf011.model.prototype.GerentePrototipos;

public class GerenteSingletons {
	
	private Map<String, GerentePrototipos> gerentePrototipos;
	
	
	public GerenteSingletons() {
		this.gerentePrototipos = new HashMap<String, GerentePrototipos>();
	}
	
	public void registrar(String nome,  GerentePrototipos gerentePrototipos) {
		this.gerentePrototipos.put(nome, gerentePrototipos);
	}
	
	public GerentePrototipos buscar(String nome) {
		return  this.gerentePrototipos.get(nome);
	}
	

	
	

}
