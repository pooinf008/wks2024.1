package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;
import br.ifba.inf011.model.composite.MensageiroComposite;
import br.ifba.inf011.model.decorator.SemBrancoDecorator;
import br.ifba.inf011.model.decorator.SemVogalDecorator;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	private Mensageiro mensageiro;
	
	public Aplicacao() {
		this.asm();
	}
	
	public void asm() {
		
		MensageiroComposite mensageiroComposite2 = new MensageiroComposite();
		MensageiroComposite mensageiroComposite1 = new MensageiroComposite();
		mensageiroComposite1.addMensageiro(new MensageiroINF011());
		mensageiroComposite1.addMensageiro(new MensageiroINF011());
		mensageiroComposite2.addMensageiro(mensageiroComposite1);
		mensageiroComposite2.addMensageiro(new MensageiroINF011());
		//this.mensageiro = mensageiroComposite2;
		this.mensageiro = new MensageiroINF011();
	}
	
	public void run() throws Exception {
		this.mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
	}
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).run();
	}		

}
