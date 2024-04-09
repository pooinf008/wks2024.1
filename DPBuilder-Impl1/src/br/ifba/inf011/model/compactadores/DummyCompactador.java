package br.ifba.inf011.model.compactadores;

import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.Conteudo;

public class DummyCompactador implements Compactador{

	@Override
	public Conteudo compactar(Conteudo conteudo) {
		return conteudo;
	}
	


}
