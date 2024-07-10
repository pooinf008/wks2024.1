package br.ifba.inf011.model.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.ifba.inf011.model.Mensageiro;

public class SemBrancoDecorator extends MensageiroDecorator implements Mensageiro{
	
	public SemBrancoDecorator(Mensageiro mensageiro) {
		super(mensageiro);
	}
	
	public void enviar(String  conteudo) throws Exception{
		StringBuffer compactado = new StringBuffer();
		for(char c : conteudo.toCharArray())
			if(c != ' ')
				compactado.append(c);
		super.enviar(compactado.toString());
	}; 	
	
	

	

}
