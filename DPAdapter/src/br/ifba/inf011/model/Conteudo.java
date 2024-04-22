package br.ifba.inf011.model;

import java.util.ArrayList;
import java.util.List;

public class Conteudo {
	
	private List<Character> conteudo;
	
	public Conteudo(char[] conteudo) {
		this.conteudo = new ArrayList<Character>();
		for(char c : conteudo)
			this.conteudo.add(Character.valueOf(c));
	}
	
	public Conteudo(String conteudo) {
		this(conteudo.toCharArray());
	}

	public Conteudo(List<Character> compactado) {
		this.conteudo = new  ArrayList<Character>(compactado);
	}

	public char[] asCharArray() {
		char[] body = new char[this.conteudo.size()];
		for(int iCont = 0; iCont < this.conteudo.size(); iCont++)
			body[iCont] = this.conteudo.get(iCont).charValue();
		return body;
	}	
	
	public String toString() {
		return new String(this.asCharArray());
	}	

}
