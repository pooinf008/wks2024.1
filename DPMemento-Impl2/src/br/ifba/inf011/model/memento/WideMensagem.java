package br.ifba.inf011.model.memento;

import java.util.List;
import java.util.Map;

import br.ifba.inf011.model.IndiceProcessado;
import br.ifba.inf011.model.state.MensagemState;

public interface WideMensagem {
	public MensagemState getState();
	public String getConteudo();
	public Map<String, String> getHeader();
	public List<String> getProcessada();
	public Map<IndiceProcessado, String> getNdxHandled();
}
