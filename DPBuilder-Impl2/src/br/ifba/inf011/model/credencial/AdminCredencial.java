package br.ifba.inf011.model.credencial;

import br.ifba.inf011.model.Credencial;

public class AdminCredencial extends UserSenhaCredencial implements Credencial{

	public AdminCredencial() {
		super("admin", "1234");
	}
	
	


}
