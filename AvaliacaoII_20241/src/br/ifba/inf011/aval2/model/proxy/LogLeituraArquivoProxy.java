package br.ifba.inf011.aval2.model.proxy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ifba.inf011.aval2.model.Arquivo;
import br.ifba.inf011.aval2.model.Credencial;
import br.ifba.inf011.aval2.model.Entrada;
import br.ifba.inf011.aval2.model.EntradaLegivel;

public class LogLeituraArquivoProxy implements EntradaLegivel{

	private Arquivo arquivo;
	private Map<Credencial, Integer> log;
	
	public LogLeituraArquivoProxy(Arquivo arquivo) {
		this.arquivo = arquivo;
		this.log = new HashMap<Credencial, Integer>();
	}
	
	@Override
	public String getNome() {
		return this.arquivo.getNome();
	}

	@Override
	public LocalDate getDataCriacao() {
		return this.arquivo.getDataCriacao();
	}

	@Override
	public Long getTamanho() {
		return this.arquivo.getTamanho();
	}

	@Override
	public List<Entrada> getFilhos() throws UnsupportedOperationException {
		return this.arquivo.getFilhos();
	}

	@Override
	public void addFilho(Entrada entrada) throws UnsupportedOperationException {
		this.arquivo.addFilho(entrada);
	}

	@Override
	public void removeFilho(Entrada entrada) throws UnsupportedOperationException {
		this.arquivo.removeFilho(entrada);
	}

	@Override
	public String ler(Credencial credencial) throws IllegalAccessException {
		Integer lido = (this.log.get(credencial) == null) ? 0 : this.log.get(credencial);
		lido++;
		this.log.put(credencial, lido);
		return this.arquivo.ler(credencial);
	}
	
	
	public String doLog() {
		StringBuffer str = new StringBuffer("LOG DE ACESSO ARQUIVO " + this.arquivo.getNome() + "\n");
		for(Credencial c : this.log.keySet())
			str.append(c.getId() + ": " + this.log.get(c).longValue() + " acessos\n");
		return str.toString();
	}
	
	

}
