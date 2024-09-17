package br.ifba.inf011.aval2.decorator;

import java.time.LocalDate;
import java.util.List;

import br.ifba.inf011.aval2.model.Credencial;
import br.ifba.inf011.aval2.model.Entrada;
import br.ifba.inf011.aval2.model.EntradaOperavel;

public abstract class ArquivoDecorator implements EntradaOperavel{
	
	private EntradaOperavel operavel;
	
	public ArquivoDecorator(EntradaOperavel operavel) {
		this.operavel = operavel;
	}
	
	public String getNome() {
		return this.operavel.getNome();
	};
	public LocalDate getDataCriacao() {
		return this.operavel.getDataCriacao();
	};
	
	public Long getTamanho() throws IllegalAccessException{
		return this.operavel.getTamanho();
	};
	
	public List<Entrada> getFilhos() throws UnsupportedOperationException{
		return this.operavel.getFilhos();
	};
	
	public void addFilho(Entrada entrada) throws UnsupportedOperationException{
		this.operavel.addFilho(entrada);
	};
	
	public void removeFilho(Entrada entrada) throws UnsupportedOperationException{
		this.operavel.removeFilho(entrada);
	};	
	
	public String dump() {
		return this.operavel.dump();
	};
	
	public String ler(Credencial credencial) throws IllegalAccessException{
		return this.doHeader() + this.operavel.ler(credencial) +  this.doFooter();
	};

	public void escrever(Credencial credencial, String escrever) throws IllegalAccessException{
		this.operavel.escrever(credencial, escrever);
	};
	
	public void bloquear() throws UnsupportedOperationException{
		this.operavel.bloquear();
	};
	
	public void somenteLeitura() throws UnsupportedOperationException{
		this.operavel.somenteLeitura();
	};
	
	public void excluir() throws UnsupportedOperationException{
		this.operavel.excluir();
	};
	
	public void recuperar() throws UnsupportedOperationException{
		this.operavel.recuperar();
	};
	
	public void liberar() throws UnsupportedOperationException{
		this.operavel.liberar();
	};
	
	protected String doHeader() {
		return "";
	};
	
	protected String doFooter() {
		return "";
	};;

}
