package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;

public class MensageiroINF011 extends Mensageiro{
	
	private MessageRequest request;
	private MessageResponse response;
	private AplicacaoProtocolo aplicacao;
	
	
	public MensageiroINF011() {
		ProtocoloAbstractFactory paf = new ProtocoloFTPFactory();
		this.init(paf.createProtocolo(), 
				  paf.createRequest(), 
				  paf.createResponse());
	}
	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, MessageRequest request, 
						    MessageResponse response){
		this.init(aplicacao, request, response);
	}
	
	public void init(AplicacaoProtocolo aplicacao, 
					 MessageRequest request, 
					 MessageResponse response) {
		this.request = request;
		this.response = response;
		this.aplicacao = aplicacao;
	}
	
	
	@Override
	public void enviar(String conteudo) throws Exception {
		//aplicacao.open();
		//request.addHeader("MESSAGE", "GET");
		request.setBody(new Conteudo(conteudo));
		aplicacao.message(request, response);
		///aplicacao.close();	
	}


}
