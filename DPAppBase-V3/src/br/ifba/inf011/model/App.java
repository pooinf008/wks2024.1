package br.ifba.inf011.model;

public class App {
	
	public void run() {
		Mensagem mensagem = new Mensagem("OLA LA VEM 1 ELA");
		mensagem.addHeader("TAMANHO", "CONTAR");
//		mensagem.addHeader("LANGUAGE", "ENG");
		mensagem.addHeader("MAT", "SUBS_NUM");
		ProcessadorMensagem processador = new ProcessadorMensagem();
		processador.processar(mensagem);
		System.out.println(mensagem);
	}	
	
	
	public static void main(String[] args) {
		(new App()).run();
	}
	

}
