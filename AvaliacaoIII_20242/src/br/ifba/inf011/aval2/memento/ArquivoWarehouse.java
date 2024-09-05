package br.ifba.inf011.aval2.memento;

import java.util.Stack;

import br.ifba.inf011.aval2.model.ArquivoHistorico;

public class ArquivoWarehouse {
	
	private ArquivoHistorico arquivoHistorico;
	private Stack<ArquivoHistorico.Conteudo> checkpoints = new Stack<ArquivoHistorico.Conteudo>();
	
	public ArquivoWarehouse(ArquivoHistorico arquivoHistorico) {
		this.arquivoHistorico = arquivoHistorico;
	}
	
	public void save() {
		checkpoints.push(this.arquivoHistorico.checkpoint());
	}
	
	public void undo() {
		this.arquivoHistorico.restore(checkpoints.pop());
	}

}
