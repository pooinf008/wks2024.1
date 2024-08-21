package br.ifba.inf011.model.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ifba.inf011.model.IndiceProcessado;
import br.ifba.inf011.model.state.MensagemState;

//MEMENTO EM MEMENTO
public class Snapshot implements WideMensagem, NarrowMensagem{

	private MensagemState state;
	private String conteudo;
	private Map<String, String> header;
	private List<String> processada;
	private Map<IndiceProcessado, String> ndxHandled;		
	
	public Snapshot(MensagemState state, 
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
	
	public MensagemState getState() {
		return state;
	}

	public String getConteudo() {
		return conteudo;
	}

	public Map<String, String> getHeader() {
		return header;
	}

	public List<String> getProcessada() {
		return processada;
	}

	public Map<IndiceProcessado, String> getNdxHandled() {
		return ndxHandled;
	}

}
