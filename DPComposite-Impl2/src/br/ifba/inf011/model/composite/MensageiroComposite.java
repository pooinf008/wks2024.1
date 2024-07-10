package br.ifba.inf011.model.composite;

import java.util.ArrayList;
import java.util.List;

import br.ifba.inf011.model.Mensageiro;

public class MensageiroComposite extends Mensageiro{


	protected List<Mensageiro> mensageiros;
	
	public MensageiroComposite() {
		this.mensageiros = new ArrayList<Mensageiro>();
	}
	
	public void addMensageiro(Mensageiro mensageiro) {
		this.mensageiros.add(mensageiro);
	}
	
	public void removeMensageiro(Mensageiro mensageiro) {
		this.mensageiros.remove(mensageiro);
	}
	
	public Mensageiro getMensageiro(int index) {
		return this.mensageiros.get(index);
	}
	
	@Override
	public void enviar(String conteudo) throws Exception {
		for(Mensageiro m : this.mensageiros)
			m.enviar(conteudo);
	}
	
	@Override
	public Mensageiro getComposite() {
		return this;
	}	

}
