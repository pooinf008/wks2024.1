package br.ifba.inf011.model.credencial;

import br.ifba.inf011.model.Credencial;

public class UserSenhaCredencial implements Credencial{

	
	private String userCorreto;
	private String senhaCorreto;

	private String userFornecido;
	private String senhaFornecida;
	
	
	public  UserSenhaCredencial(String userCorreto, String senhaCorreto) {
		this.userCorreto = userCorreto;
		this.senhaCorreto = senhaCorreto;
	}
	
	@Override
	public void setUser(String user) {
		this.userFornecido = user;
	}

	@Override
	public void setPasswd(String passwd) {
		this.senhaFornecida = passwd;
	}

	@Override
	public void valid() throws Exception {
		if(!(this.userCorreto.equalsIgnoreCase(this.userFornecido) &&
			 this.senhaCorreto.equalsIgnoreCase(this.senhaFornecida)))
		throw new Exception("Usuário / Senha Inválidos");
	}
	

}
