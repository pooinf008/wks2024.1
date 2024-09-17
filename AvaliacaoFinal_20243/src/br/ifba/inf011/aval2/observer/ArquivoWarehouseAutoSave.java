package br.ifba.inf011.aval2.observer;

import java.util.Stack;

import br.ifba.inf011.aval2.model.ArquivoHistorico;

public class ArquivoWarehouseAutoSave implements MudancaConteudoObserver{
	
	private ArquivoHistorico arquivoHistorico;
	private Stack<ArquivoHistorico.Conteudo> checkpoints = new Stack<ArquivoHistorico.Conteudo>();
	
	public ArquivoWarehouseAutoSave(ArquivoHistorico arquivoHistorico) {
		this.arquivoHistorico = arquivoHistorico;
		this.arquivoHistorico.attachMudancaConteudoObserver(this);
	}
	
	public void lastVersion() {
		this.arquivoHistorico.restore(checkpoints.pop());
	}

	@Override
	public void conteudoMudou() {
		// TODO Auto-generated method stub
	}

	@Override
	public void conteudoMudara() {
		this.checkpoints.push(this.arquivoHistorico.checkpoint());
	}

}
