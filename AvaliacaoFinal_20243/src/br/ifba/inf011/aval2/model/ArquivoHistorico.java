package br.ifba.inf011.aval2.model;

import java.time.LocalDate;

import br.ifba.inf011.aval2.model.bridge.Tipo;

public class ArquivoHistorico extends Arquivo implements EntradaOperavel{

	
	public class Conteudo{
		private String conteudo;
		
		private Conteudo(String conteudo) {
			this.conteudo = conteudo;
		}
		
		private String getConteudo() {
			return this.conteudo;
		}
	}
	

	public ArquivoHistorico(Tipo tipo, String nome, LocalDate dataCriacao, String conteudo) {
		super(tipo, nome, dataCriacao, conteudo);
	}
	
	public Conteudo checkpoint() {
		return new Conteudo(this.dump());
	}
	
	public void restore(Conteudo conteudo) {
		this.setConteudo(conteudo.getConteudo());
	}


}
