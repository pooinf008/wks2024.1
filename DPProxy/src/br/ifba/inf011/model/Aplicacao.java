package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;
import br.ifba.inf011.model.protocolos.transporte.TCPProtocolo;
import br.ifba.inf011.model.proxy.MensageiroProxy;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send(Mensageiro mensageiro) throws Exception {
		mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");		
		mensageiro.enviarBroadcast("MENSAGEM ENVIADA PELO MENSAGEIRO");
	}
	
	public void run() throws Exception {
		ProtocoloAbstractFactory paf = new ProtocoloFTPFactory();
		Mensageiro mensageiro =
						new MensageiroProxy("system", "root",
								new MensageiroINF011(paf.createProtocolo(), paf.createRequest(), paf.createResponse())
						);
		this.send(mensageiro);
	}
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).run();
	}		

}
