package br.ifba.inf011.model;

import br.ifba.inf011.model.adapter.ObjectClosedProtocolAdapter;
import br.ifba.inf011.model.compactadores.DummyCompactador;
import br.ifba.inf011.model.compactadores.EspacoCompactador;
import br.ifba.inf011.model.credencial.AbertaCredencial;
import br.ifba.inf011.model.externo.ClosedProtocol;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.aplicacao.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.transporte.TCPProtocolo;

//CREATOR em FACTORY METHOD
public class Aplicacao {
	
	public void send() throws Exception {
		Mensageiro<String> mensageiro = new MensageiroINF011(new FTPProtocolo(),
															 new TCPProtocolo(),
															 new FTPMessageRequest(),
															 new FTPMessageResponse(),
															 new AbertaCredencial(),
															 new DummyCompactador());											
		mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
		
	}
	
	public void send2() throws Exception {
		
		ObjectClosedProtocolAdapter protocolAdapter = new ObjectClosedProtocolAdapter(new ClosedProtocol(), "network", 4545);
		
		Mensageiro<String> mensageiro = new MensageiroINF011(protocolAdapter, 
															 null, 
															 protocolAdapter, 
															 null, 
															 new AbertaCredencial(), 
															 new EspacoCompactador());
		mensageiro.enviar("MENSAGEM ENVIADA PELO MENSAGEIRO");
		
	}		
	
	
	public static void main(String[] args) throws Exception {
		(new Aplicacao()).send2();
	}		

}
