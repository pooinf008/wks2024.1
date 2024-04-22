package br.ifba.inf011.model;

import java.util.HashMap;
import java.util.Map;

public class MensageiroInfo {
	
	private Map<String, String> valores;
	
	public MensageiroInfo() {
		this.valores = new HashMap<String, String>();
	}
	
	public void add(String key, String value) {
		this.valores.put(key, value);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("MENSAGEIRO INFO\n");
		for(String key : this.valores.keySet())
			str.append(key + ":" + this.valores.get(key) + "\n");
		return str.toString();
	}

}
