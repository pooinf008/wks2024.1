package br.ifba.inf011.model.decorator;

import br.ifba.inf011.model.Mensageiro;

public abstract class MensageiroDecorator implements Mensageiro{
	
	private Mensageiro mensageiro;
	
	public MensageiroDecorator(Mensageiro mensageiro) {
		this.mensageiro = mensageiro;
	}

	public void enviar(String  conteudo) throws Exception{
		this.mensageiro.enviar(conteudo);
	}; 
	
	public void enviarBroadcast(String  conteudo) throws Exception{
		this.mensageiro.enviarBroadcast(conteudo);
	};	
	
	
}
