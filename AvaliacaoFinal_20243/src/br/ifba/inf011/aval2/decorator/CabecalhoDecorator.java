package br.ifba.inf011.aval2.decorator;

import br.ifba.inf011.aval2.model.EntradaOperavel;

public class CabecalhoDecorator extends ArquivoDecorator{
	
	private String cabecalho;
	
	public CabecalhoDecorator(EntradaOperavel a1, String cabecalho) {
		super(a1);
		this.cabecalho = cabecalho;
	}
	
	public String doHeader() {
		return this.cabecalho;
	}

}
