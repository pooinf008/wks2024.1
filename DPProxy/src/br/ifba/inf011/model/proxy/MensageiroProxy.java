package br.ifba.inf011.model.proxy;

import br.ifba.inf011.model.Mensageiro;
import br.ifba.inf011.model.MensageiroINF011;

public class MensageiroProxy implements Mensageiro{
	
	private MensageiroINF011 mensageiro;
	private String user;
	private String pwd;
	
	
	public MensageiroProxy(String user, String pwd, MensageiroINF011 mensageiro) {
		this.mensageiro = mensageiro;
		this.user = user;
		this.pwd = pwd;
	}

	@Override
	public void enviar(String conteudo) throws Exception {
		this.mensageiro.enviar(conteudo);
	}

	@Override
	public void enviarBroadcast(String conteudo) throws Exception {
		if(!(this.user.equalsIgnoreCase("system")&&
			(this.pwd.equalsIgnoreCase("root"))))
			throw new Exception("SEM CAPABILITY");
		this.mensageiro.enviarBroadcast(conteudo);
	}

}
