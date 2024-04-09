package br.ifba.inf011.model.protocolos.transporte;

import br.ifba.inf011.model.TransporteProtocolo;

public class UDPProtocolo implements TransporteProtocolo{
	
	public void send(char[] conteudo) {
		System.out.println("Enviando " + ((conteudo == null) ? "<<MESSAGE>>" : (new String(conteudo)).toString()) + " sobre conexão NÃO confiável (UDP)");
	};
	
	public void open() {
		System.out.println("Estabelecendo conexão NÃO confiável (UDP)");
	};
	
	public void close(){
		System.out.println("Fechando conexão NÃO confiável (UDP)");
	};
	

}
