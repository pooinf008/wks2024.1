package br.ifba.inf011.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

import br.ifba.inf011.model.memento.Originator;
import br.ifba.inf011.model.state.EditavelState;
import br.ifba.inf011.model.state.MensagemState;

//ORIGINATOR EM MEMENTO
public class Mensagem implements Originator<Mensagem.Snapshot>{
	
	//MEMENTO EM MEMENTO
	public class Snapshot{

		private Snapshot(MensagemState state, 
						String conteudo,
						Map<String, String> header,
						List<String> processada,
						Map<IndiceProcessado, String> ndxHandled) {
			this.state = state;
			this.conteudo = conteudo;
			this.header = new HashMap<String, String>(header);
			this.processada = new ArrayList<String>(processada);
			this.ndxHandled = new HashMap<IndiceProcessado, String>(ndxHandled);
		}
		
		private MensagemState getState() {
			return state;
		}

		private String getConteudo() {
			return conteudo;
		}

		private Map<String, String> getHeader() {
			return header;
		}

		private List<String> getProcessada() {
			return processada;
		}

		private Map<IndiceProcessado, String> getNdxHandled() {
			return ndxHandled;
		}

		private MensagemState state;
		private String conteudo;
		private Map<String, String> header;
		private List<String> processada;
		private Map<IndiceProcessado, String> ndxHandled;		
	}
	
	private MensagemState state;
	private String conteudo;
	private Map<String, String> header;
	private List<String> processada;
	private Map<IndiceProcessado, String> ndxHandled;
	
	public Mensagem(String conteudo) {
		this.header = new HashMap<String, String>();
		this.processada = new ArrayList<String>();
		this.conteudo = conteudo;
		this.ndxHandled = new HashMap<IndiceProcessado, String>();
		this.state = new EditavelState();
	}
	
	public void addHeader(String key, String value) throws OperationNotSupportedException {
		this.state.addHeader(key, value, this.header);
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
	
	public void setConteudo(String conteudo) throws OperationNotSupportedException{
		this.conteudo = this.state.setConteudo(conteudo);
	}
	
	public void assine() throws OperationNotSupportedException{
		this.state = this.state.assinar();
	};
	public void selar() throws OperationNotSupportedException{
		this.state = this.state.selar();
	};
	
	public void edite() throws OperationNotSupportedException{
		this.state = this.state.editar();
	};	
	
	public Mensagem.Snapshot snapshot(){
		return new Mensagem.Snapshot(this.state,
									 this.conteudo,
									 this.header,
									 this.processada,
									 this.ndxHandled);
	}
	
	public void back(Mensagem.Snapshot snapshot){
		this.state = snapshot.getState();
		this.conteudo = snapshot.getConteudo();
		this.header = snapshot.getHeader();
		this.processada = snapshot.getProcessada();
		this.ndxHandled = snapshot.getNdxHandled();
	};	
}

