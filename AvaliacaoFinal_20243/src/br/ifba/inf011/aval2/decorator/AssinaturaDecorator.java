package br.ifba.inf011.aval2.decorator;

import br.ifba.inf011.aval2.model.EntradaOperavel;

public class AssinaturaDecorator extends ArquivoDecorator{
	
	private String assinatura;
	
	public AssinaturaDecorator(EntradaOperavel a1, String assinatura) {
		super(a1);
		this.assinatura = assinatura;
	}
	
	public String doFooter() {
		return this.assinatura;
	}

}
