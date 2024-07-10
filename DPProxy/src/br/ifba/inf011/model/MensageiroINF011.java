package br.ifba.inf011.model;

public class MensageiroINF011 implements Mensageiro{
	
	private MessageRequest request;
	private MessageResponse response;
	private AplicacaoProtocolo aplicacao;
	
	public MensageiroINF011(AplicacaoProtocolo aplicacao, MessageRequest request, 
						    MessageResponse response){
		this.request = request;
		this.response = response;
		this.aplicacao = aplicacao;
	}
	
	
	@Override
	public void enviar(String conteudo) throws Exception {
		aplicacao.open();
		request.addHeader("MESSAGE", "GET");
		request.setBody(new Conteudo(conteudo));
		aplicacao.message(request, response);
		aplicacao.close();	
	}
	
	public void enviarBroadcast(String  conteudo) throws Exception{
		this.enviar("BROADCAST MESSAGE:\\> " + conteudo);
	};	
	

}
