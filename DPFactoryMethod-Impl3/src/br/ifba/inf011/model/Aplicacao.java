package br.ifba.inf011.model;

import java.lang.reflect.InvocationTargetException;

import br.ifba.inf011.model.protocolos.ftp.FTPMessageRequest;
import br.ifba.inf011.model.protocolos.ftp.FTPMessageResponse;
import br.ifba.inf011.model.protocolos.ftp.FTPProtocolo;
import br.ifba.inf011.model.protocolos.http.HTTPMessageRequest;
import br.ifba.inf011.model.protocolos.http.HTTPMessageResponse;
import br.ifba.inf011.model.protocolos.http.HTTPProtocolo;

public class Aplicacao{
	
	
	public void send(String protocoloName, String requestName, String responseName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Protocolo protocolo = this.createProtocolo(protocoloName);
		MessageRequest request = this.createRequest(requestName);
		MessageResponse response = this.createResponse(responseName);
		protocolo.open();
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	protected MessageResponse createResponse(String responseName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		MessageResponse messageResponse =  (MessageResponse) Class.forName(responseName).getDeclaredConstructor().newInstance();
		return messageResponse;
	};

	protected MessageRequest createRequest(String requestName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		MessageRequest messageRequest =  (MessageRequest) Class.forName(requestName).getDeclaredConstructor().newInstance();
		return messageRequest;
	};

	protected Protocolo createProtocolo(String protocoloName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Protocolo protocolo =  (Protocolo) Class.forName(protocoloName).getDeclaredConstructor().newInstance();
		return protocolo;
	};

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		(new Aplicacao()).send(args[0], 
							   args[1],
							   args[2]);
	}	
	
	

}
