package br.ifba.inf011.model.adapter;

import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.Conteudo;
import br.ifba.inf011.model.externo.NumeroZip;

public class ClassNumeroZipAdapter extends NumeroZip
		implements Compactador{

	@Override
	public Conteudo compactar(Conteudo conteudo) {
		return this.zip(conteudo);
	}

}
