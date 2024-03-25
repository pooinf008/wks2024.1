package br.ifba.inf011.model.compactadores;

import java.util.ArrayList;
import java.util.List;

import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.Conteudo;

public class EspacoCompactador implements Compactador{

	@Override
	public Conteudo compactar(Conteudo conteudo) {
		List<Character> compactado = new ArrayList<Character>();
		for(char c : conteudo.asCharArray())
			if(c != ' ')
				compactado.add(c);
		return new Conteudo(compactado);
			
	}	

}
