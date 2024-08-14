package br.ifba.inf011.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mensagem {

	
	private class IndiceProcessado{
		
		protected String meaning;
		protected Integer ndx;		
		
		private IndiceProcessado(String meaning, int ndx) {
			this.meaning = meaning;
			this.ndx = ndx;
		}

		public String getMeaning() {
			return this.meaning;
		}

		public Integer getNdx() {
			return this.ndx;
		}
	}
	
	private String conteudo;
	private Map<String, String> header;
	private List<String> processada;
	private Map<IndiceProcessado, String> ndxHandled;
	
	public Mensagem(String conteudo) {
		this.header = new HashMap<String, String>();
		this.processada = new ArrayList<String>();
		this.conteudo = conteudo;
		this.ndxHandled = new HashMap<IndiceProcessado, String>();
	}
	
	public void addHeader(String key, String value) {
		this.header.put(key, value);
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
		
	
	
	public String getHeaderValue(String key) {
		return (this.header.get(key) == null) ? "" : this.header.get(key);
	}
	
	public void addHandled(String meaning, String conteudo) {
		IndiceProcessado indice = new IndiceProcessado(meaning, this.processada.size());
		this.ndxHandled.put(indice, conteudo) ;
		this.processada.add(conteudo);
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(this.conteudo + "\n");
		for(IndiceProcessado indice : this.ndxHandled.keySet()) {
			Integer ndx = indice.getNdx();
			String meaning = indice.getMeaning();
			String processada = this.processada.get(ndx);
			str.append("\t" +  meaning + ": " + processada + "\n");
			str.append("\n");
		}	
		return str.toString();
	}
	
	

}

