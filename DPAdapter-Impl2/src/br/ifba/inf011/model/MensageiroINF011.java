package br.ifba.inf011.model;


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

}
