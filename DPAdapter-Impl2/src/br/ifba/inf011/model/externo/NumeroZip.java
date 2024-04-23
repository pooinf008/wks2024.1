package br.ifba.inf011.model.externo;

import br.ifba.inf011.model.Conteudo;

public class NumeroZip {

	public Conteudo zip(Conteudo conteudo) {
		String content = new String(conteudo.asCharArray()); 
		content = content.toString().replace("zero", "0");
		content = content.toString().replace("um", "1");
		content = content.toString().replace("dois", "2");
		return new Conteudo(content);
	}	

}
