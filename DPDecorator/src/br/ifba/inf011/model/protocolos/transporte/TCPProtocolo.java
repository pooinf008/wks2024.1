package br.ifba.inf011.model.protocolos.transporte;

import br.ifba.inf011.model.TransporteProtocolo;

public class TCPProtocolo implements TransporteProtocolo{
	
	public void send(char[] conteudo) {
		System.out.println("Enviando " + ((conteudo == null) ? "<<MESSAGE>>" : (new String(conteudo)).toString()) + " sobre conexão confiável (TCP)");
	};
	
	public void open() {
		System.out.println("Estabelecendo conexão confiável (TCP)");
	};
	
	public void close(){
		System.out.println("Fechando conexão confiável (TCP)");
	};
	

}
