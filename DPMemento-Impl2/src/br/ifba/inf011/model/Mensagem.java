package br.ifba.inf011.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

import br.ifba.inf011.model.memento.NarrowMensagem;
import br.ifba.inf011.model.memento.Snapshot;
import br.ifba.inf011.model.memento.WideMensagem;
import br.ifba.inf011.model.state.EditavelState;
import br.ifba.inf011.model.state.MensagemState;


//ORIGINATOR EM MEMENTO
public class Mensagem{
	
	
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
	
	public NarrowMensagem snapshot(){
		return new Snapshot(this.state,
							this.conteudo,
							this.header,
							this.processada,
							this.ndxHandled);
	}
	
	public void back(NarrowMensagem snapshot){
		WideMensagem snap = (WideMensagem) snapshot;
		this.state = snap.getState();
		this.conteudo = snap.getConteudo();
		this.header = snap.getHeader();
		this.processada = snap.getProcessada();
		this.ndxHandled = snap.getNdxHandled();
	};	
}

