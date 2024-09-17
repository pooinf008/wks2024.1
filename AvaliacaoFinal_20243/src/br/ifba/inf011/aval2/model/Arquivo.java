package br.ifba.inf011.aval2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.ifba.inf011.aval2.model.bridge.Tipo;
import br.ifba.inf011.aval2.model.composite.AbstractEntrada;
import br.ifba.inf011.aval2.model.state.ArquivoState;
import br.ifba.inf011.aval2.model.state.NormalState;
import br.ifba.inf011.aval2.observer.MudancaConteudoObserver;

public class Arquivo extends AbstractEntrada implements EntradaOperavel{
	
	private ArquivoState state;
	private Tipo tipo;
	private String conteudo;
	
	private List<MudancaConteudoObserver> observers;

	public Arquivo(Tipo tipo, String nome, LocalDate dataCriacao, String conteudo) {
		super(nome, dataCriacao);
		this.tipo = tipo;
		this.conteudo =  this.tipo.write(conteudo);
		this.state = new NormalState();
		this.observers = new ArrayList<MudancaConteudoObserver>();
	}
	
	
	public void attachMudancaConteudoObserver(MudancaConteudoObserver observer) {
		this.observers.add(observer);
	}
	
	public void detachMudancaConteudoObserver(MudancaConteudoObserver observer) {
		this.observers.add(observer);
	}
	
	private void notifyConteudoMudou() {
		for(MudancaConteudoObserver observer : this.observers)
			observer.conteudoMudou();
	}

	private void notifyConteudoMudara() {
		for(MudancaConteudoObserver observer : this.observers)
			observer.conteudoMudara();		
	}
		
	
	

	@Override
	public List<Entrada> getFilhos() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	@Override
	public void addFilho(Entrada entrada) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeFilho(Entrada entrada) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	@Override
	public Long getTamanho() throws IllegalAccessException{
		return this.state.getTamanho(this.conteudo);
	}
	
	@Override
	public String ler(Credencial credencial) throws IllegalAccessException{
		return this.tipo.read(this.state.ler(credencial, this.conteudo));
	}

	@Override
	public void escrever(Credencial credencial, String conteudo) throws IllegalAccessException {
		this.notifyConteudoMudara();
		this.conteudo = this.tipo.write(this.state.escrever(credencial, conteudo));
		this.notifyConteudoMudou();
	}
	
	public void bloquear() throws UnsupportedOperationException{
		this.state = this.state.bloquear();
	};
	
	public void somenteLeitura() throws UnsupportedOperationException{
		this.state = this.state.somenteLeitura();
	};
	
	public void excluir() throws UnsupportedOperationException{
		this.state = this.state.excluir();
	};
	
	public void recuperar() throws UnsupportedOperationException{
		this.state = this.state.recuperar();
	};
	
	public void liberar() throws UnsupportedOperationException{
		this.state = this.state.liberar();
	}

	@Override
	public String dump(){
		return this.conteudo;
	};
	
	protected void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
