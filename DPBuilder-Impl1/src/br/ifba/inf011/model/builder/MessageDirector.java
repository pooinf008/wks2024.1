package br.ifba.inf011.model.builder;

import br.ifba.inf011.model.TipoProtocolo;
import br.ifba.inf011.model.compactadores.DummyCompactador;
import br.ifba.inf011.model.compactadores.EspacoCompactador;

public class MessageDirector {
	
	private  MessageBuilder builder;
	
	
	public MessageDirector(MessageBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(MessageBuilder builder) {
		this.builder = builder;
	}	
	
	
	public void createComunicacaoBasica() {
		this.builder.reset();
		this.builder.setTipoProtocolo(TipoProtocolo.FTP);
		this.builder.setConfiavel(true);
		this.builder.setSeguro(false);
		this.builder.setCompactador(new DummyCompactador());
	}
	
	public void createComunicacaoBasicaNaoConfiavel() {
		this.builder.reset();
		this.builder.setTipoProtocolo(TipoProtocolo.HTTP);
		this.builder.setConfiavel(false);
		this.builder.setSeguro(false);
		this.builder.setCompactador(new EspacoCompactador());
	}	
	

}
