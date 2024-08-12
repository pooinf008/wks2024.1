package br.ifba.inf011.aval2.model;

import java.util.Objects;

public class Credencial {
	
	private String id;
	
	public Credencial(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credencial other = (Credencial) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
