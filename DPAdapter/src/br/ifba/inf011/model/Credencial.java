package br.ifba.inf011.model;

public interface Credencial{
	
	public void setUser(String user);
	public void setPasswd(String passwd);
	public void valid() throws Exception;

}
