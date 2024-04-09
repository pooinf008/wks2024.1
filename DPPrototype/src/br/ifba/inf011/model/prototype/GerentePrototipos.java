package br.ifba.inf011.model.prototype;

import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.model.Mensageiro;

public class GerentePrototipos {
	
	private Map<String, Mensageiro<String>> mensageiros;
	
	private static GerentePrototipos gerente = null;
	
	public static GerentePrototipos instancia() {
		if(GerentePrototipos.gerente == null)
			GerentePrototipos.gerente = new GerentePrototipos();
		return GerentePrototipos.gerente;
	}
	
	private GerentePrototipos() {
		this.mensageiros = new HashMap<String, Mensageiro<String>>();
	}
	
	public void registrar(String nome,  Mensageiro<String> mensageiro) {
		this.mensageiros.put(nome, mensageiro);
	}
	
	public Mensageiro<String> buscar(String nome) {
		return (Mensageiro<String>) this.mensageiros.get(nome).prototipar();
	}
	
	
	

}
