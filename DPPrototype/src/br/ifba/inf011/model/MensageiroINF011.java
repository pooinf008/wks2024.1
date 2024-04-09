package br.ifba.inf011.model;

import br.ifba.inf011.model.compactadores.DummyCompactador;
import br.ifba.inf011.model.credencial.AbertaCredencial;
import br.ifba.inf011.model.protocolos.transporte.TCPProtocolo;
import br.ifba.inf011.model.prototype.Prototype;

public class MensageiroINF011 implements Mensageiro<String>{
	
	private MessageRequest request;
	private MessageResponse response;
	private AplicacaoProtocolo aplicacao;
	private Credencial credencial;
	private Compactador compactador;

	
	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, TransporteProtocolo transporte, MessageRequest request, 
						    MessageResponse response, Credencial credencial, Compactador compactador){
		this.request = request;
		this.response = response;
		this.aplicacao = aplicacao;
		this.compactador = compactador;
		this.credencial = credencial;
		this.aplicacao.setTransporte(transporte);
	}
	
	
	public MensageiroINF011(MensageiroINF011 outro) {
		this.request =  (MessageRequest) outro.request.prototipar();
		this.response = (MessageResponse) outro.response.prototipar();
		this.aplicacao = (AplicacaoProtocolo) outro.aplicacao.prototipar();
		this.compactador = outro.compactador;
		this.credencial = outro.credencial;
	}
	
	
	@Override
	public void enviar(String conteudo) throws Exception {
		aplicacao.open();
		credencial.setUser("admin");
		credencial.setPasswd("12345");	
		credencial.valid();
		request.addHeader("MESSAGE", "GET");
		request.setBody(this.compactador.compactar(new Conteudo(conteudo)));
		aplicacao.message(request, response);
		aplicacao.close();	
	}



	@Override
	public Prototype prototipar() {
		return new MensageiroINF011(this);
	}



	@Override
	public void modificarTransporte(TransporteProtocolo transporte) {
		this.aplicacao.setTransporte(transporte);
	}

}
