package br.ifba.inf011.model.memento;

import java.util.Stack;

import br.ifba.inf011.model.Mensagem;

//CARETAKER EM MEMENTO
public class MensagemHistoria{

	private Mensagem mensagem;
	private Stack<NarrowMensagem> snaps = new  Stack<NarrowMensagem>();
	
	public MensagemHistoria(Mensagem mensagem){
		this.mensagem = mensagem;
	}
	
	public void save() {
		NarrowMensagem snap = this.mensagem.snapshot();
		this.snaps.push(snap);
	}
	
	public void undo() {
		if(this.snaps.empty())
			return;
		NarrowMensagem snap = this.snaps.pop();
		this.mensagem.back(snap);
	}
	
	
}
