package br.ifba.inf011.model.observer;

public class EventoMudancaEstado {
	
	
	private String estadoOriginal;
	private String estadoNovo;
	private String conteudo;
	
	public EventoMudancaEstado(String conteudo, String estadoOriginal, String estadoNovo) {
		super();
		this.estadoOriginal = estadoOriginal;
		this.estadoNovo = estadoNovo;
		this.conteudo = conteudo;
	}

	public String getEstadoOriginal() {
		return estadoOriginal;
	}

	public String getEstadoNovo() {
		return estadoNovo;
	}

	public String getConteudo() {
		return conteudo;
	}

	
	
}
