package br.ifba.inf011.model;

public class IndiceProcessado{
	
	protected String meaning;
	protected Integer ndx;		
	
	public IndiceProcessado(String meaning, int ndx) {
		this.meaning = meaning;
		this.ndx = ndx;
	}

	public String getMeaning() {
		return this.meaning;
	}

	public Integer getNdx() {
		return this.ndx;
	}
}

