package br.ifba.inf011.model.builder;

import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.TipoProtocolo;

public interface MessageBuilder {
	public void reset();
	public void setTipoProtocolo(TipoProtocolo ftp);
	public void setConfiavel(Boolean confiavel);
	public void setSeguro(Boolean b);
	public void setCompactador(Compactador dummyCompactador);

}
