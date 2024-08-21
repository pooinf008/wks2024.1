package br.ifba.inf011.model.memento;

import java.util.Stack;

//CARETAKER EM MEMENTO
public class MensagemHistoria<M> {

	private Originator<M> mensagem;
	private Stack<M> snaps = new  Stack<M>();
	
	public MensagemHistoria(Originator<M> mensagem){
		this.mensagem = mensagem;
	}
	
	public void save() {
		M snap = this.mensagem.snapshot();
		this.snaps.push(snap);
	}
	
	public void undo() {
		if(this.snaps.empty())
			return;
		M snap = this.snaps.pop();
		this.mensagem.back(snap);
	}
	
	
}
