package br.ifba.inf011.model.compactadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.Conteudo;

public class VogalCompactador implements Compactador{

	
	public List<Character> vogais;
	
	public  VogalCompactador() {
		this.vogais = Arrays.asList('A', 'E', 'I', 'O', 'U');
	}
	
	
	@Override
	public Conteudo compactar(Conteudo conteudo) {
		List<Character> compactado = new ArrayList<Character>();
		for(char c : conteudo.asCharArray())
			if(!this.vogais.contains(Character.toUpperCase(c)))
				compactado.add(c);
		return new Conteudo(compactado);
	}

}
