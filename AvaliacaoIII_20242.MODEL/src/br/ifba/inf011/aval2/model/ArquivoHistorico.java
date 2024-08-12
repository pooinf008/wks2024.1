package br.ifba.inf011.aval2.model;

import java.time.LocalDate;

public class ArquivoHistorico extends Arquivo implements EntradaOperavel{


	public ArquivoHistorico(String nome, LocalDate dataCriacao, String conteudo) {
		super(nome, dataCriacao, conteudo);
	}


}
