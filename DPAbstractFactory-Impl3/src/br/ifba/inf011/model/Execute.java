package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloHTTPFactory;

public class Execute {
	
	public static void main(String[] args) {
		(new Aplicacao()).send(new ProtocoloHTTPFactory());
	}

}
