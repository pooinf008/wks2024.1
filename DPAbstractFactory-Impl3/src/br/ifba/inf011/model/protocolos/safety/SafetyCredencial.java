package br.ifba.inf011.model.protocolos.safety;

import br.ifba.inf011.model.Credencial;

public class SafetyCredencial implements Credencial{
	
	private String user;
	private String pwd;

	@Override
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public void setPasswd(String passwd) {
		this.pwd = passwd;
		
	}

	@Override
	public void valid() throws Exception {
		if(!(this.user.equals("admin") && 
		     this.pwd.equals("1234")))
			throw new Exception("Credencial Invalida");
	}

}
