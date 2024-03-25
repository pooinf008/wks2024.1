package br.ifba.inf011.model;

import br.ifba.inf011.model.compactadores.DummyCompactador;
import br.ifba.inf011.model.credencial.AbertaCredencial;
import br.ifba.inf011.model.protocolos.transporte.TCPProtocolo;

public class MensageiroINF011 implements Mensageiro<String>{
	
	private MessageRequest request;
	private MessageResponse response;
	private AplicacaoProtocolo aplicacao;
	private Credencial credencial;
	private Compactador compactador;

	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, MessageRequest request, MessageResponse response) {
		this(aplicacao, new TCPProtocolo(), request, response, new AbertaCredencial(), new DummyCompactador());
	}

	public MensageiroINF011(AplicacaoProtocolo aplicacao, TransporteProtocolo transporte, MessageRequest request, MessageResponse response) {
		this(aplicacao, transporte, request, response, new AbertaCredencial(), new DummyCompactador());
	}
	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, MessageRequest request, MessageResponse response, Credencial credencial) {
		this(aplicacao, new TCPProtocolo(), request, response, credencial, new DummyCompactador());
	}
	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, MessageRequest request, MessageResponse response, Compactador compactador) {
		this(aplicacao, new TCPProtocolo(), request, response, new AbertaCredencial() , compactador);
	}
	
	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, TransporteProtocolo transporte, MessageRequest request, 
						    MessageResponse response, Credencial credencial, Compactador compactador){
		this.request = request;
		this.response = response;
		this.aplicacao = aplicacao;
		this.compactador = compactador;
		this.credencial = credencial;
		this.aplicacao.setTransporte(transporte);
	}
	
	
	
	@Override
	public void enviar(String conteudo) throws Exception {
		aplicacao.open();
		credencial.setUser("admin");
		credencial.setPasswd("1234");	
		credencial.valid();
		request.addHeader("MESSAGE", "GET");
		request.setBody(this.compactador.compactar(new Conteudo(conteudo)));
		aplicacao.message(request, response);
		aplicacao.close();	
	}

}
