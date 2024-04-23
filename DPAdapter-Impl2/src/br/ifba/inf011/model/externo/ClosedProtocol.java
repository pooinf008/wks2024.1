package br.ifba.inf011.model.externo;

public class ClosedProtocol {
	
	public void deliver(Listener host, char[] conteudo) {
		String mensagem = new String(conteudo);
		System.out.println("Abrindo conexão CLOSED PROTOCOL  em closed://" + host.getHost() + ":" + host.getPort() + "...");		
		System.out.println("Enviando Message: " + mensagem);
		System.out.println("Fechando conexão CLOSED PROTOCOL  em closed://" + host.getHost() + ":" + host.getPort() + "...");
	}

}
