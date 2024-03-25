package br.ifba.inf011.model.protocolos.aplicacao;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.TransporteProtocolo;

public abstract class AbstractAplicacaoProtocolo implements AplicacaoProtocolo{
	
	private TransporteProtocolo transporte;
	private Integer port;
	private String  host;
	
	public AbstractAplicacaoProtocolo(String  host, Integer port) {
		this.host = host;
		this.port = port;
	}	
	
	
	public void open() {
		this.transporte.open();
		System.out.println("Abrindo conexão " + this.getNome() + " em " + this.getURINome() + "://" + this.host + ":" + this.port + "...");		
	};
	

	public void message(MessageRequest request, MessageResponse response) {
		System.out.println("Enviando Message: " + request);
		this.transporte.send(request.getBody());
		response.addHeader("HOST", this.host);
		response.addHeader("PORT", String.valueOf(this.port));
		if(request.getBody()!= null)
			response.setBody(request.getBody().toString());
	};
	
	public void close() {
		this.transporte.close();
		System.out.println("Fechando conexão " + this.getNome() + " em " + this.getURINome() + "://" + this.host + ":" + this.port + "...");
	};
	
	public void setTransporte(TransporteProtocolo protocolo) {
		this.transporte = protocolo;
	};	
	
	
	protected abstract String getURINome();
	protected abstract String getNome();
	

	
	
	

}
