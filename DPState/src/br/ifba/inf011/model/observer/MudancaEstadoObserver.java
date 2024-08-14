package br.ifba.inf011.model.observer;

import br.ifba.inf011.model.Mensagem;

public interface MudancaEstadoObserver {
	
	public void notifyMudancaEstado(EventoMudancaEstado evento);

}
