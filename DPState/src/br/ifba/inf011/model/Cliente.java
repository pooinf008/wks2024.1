package br.ifba.inf011.model;

import br.ifba.inf011.model.observer.EventoMudancaEstado;
import br.ifba.inf011.model.observer.MudancaEstadoObserver;

public class Cliente implements MudancaEstadoObserver{

	
	
	@Override
	public void notifyMudancaEstado(EventoMudancaEstado evento) {
		String conteudo = evento.getConteudo();
		String estadoAnterior = evento.getEstadoOriginal();
		String estadoNovo = evento.getEstadoNovo();
		
		System.err.println("MENSAGEM <<" + conteudo +  ">> MUDOU PARA ESTADO << " + estadoAnterior + "-->" + estadoNovo + ">>");
	}

}
