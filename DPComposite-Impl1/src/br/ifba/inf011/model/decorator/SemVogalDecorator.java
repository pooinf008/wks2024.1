package br.ifba.inf011.model.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.ifba.inf011.model.Mensageiro;

public class SemVogalDecorator extends MensageiroDecorator implements Mensageiro{
	
	public List<Character> vogais;
	
	public SemVogalDecorator(Mensageiro mensageiro) {
		super(mensageiro);
		this.vogais = Arrays.asList('A', 'E', 'I', 'O', 'U');
	}
	
	public void enviar(String  conteudo) throws Exception{
		StringBuffer compactado = new StringBuffer();
		for(char c : conteudo.toCharArray())
			if(!this.vogais.contains(Character.toUpperCase(c)))
				compactado.append(c);
		super.enviar(compactado.toString());
	}; 	
	
	

	

}
