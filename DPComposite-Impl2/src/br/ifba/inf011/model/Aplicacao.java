package br.ifba.inf011.model;

import br.ifba.inf011.model.composite.MensageiroComposite;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	private Mensageiro mensageiro;
	
	public Aplicacao() {
		this.asm();
	}
	
	public void asm() {
		
		Mensageiro mensageiro2 = new MensageiroComposite();

		
		Mensageiro mensageiro1 = new MensageiroComposite();
		
		if(mensageiro1.getComposite() != null) {
			mensageiro1.addMensageiro(new MensageiroINF011());
			mensageiro1.addMensageiro(new MensageiroINF011());
		}	
		
		if(mensageiro2.getComposite() != null) {
			mensageiro2.addMensageiro(mensageiro1);
			mensageiro2.addMensageiro(new MensageiroINF011());
		}
		
//		this.mensageiro = mensageiro2;
		
		this.mensageiro = new MensageiroINF011();
		if(this.mensageiro.getComposite() != null) {
			this.mensageiro.addMensageiro(new MensageiroINF011());
		}else {
			System.out.println("Erro na montagem");
		}
		
	}
	
	public void run() throws Exception {
		this.mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
	}
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).run();
	}		

}
