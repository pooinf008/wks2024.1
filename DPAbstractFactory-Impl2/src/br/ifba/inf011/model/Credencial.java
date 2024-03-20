package br.ifba.inf011.model;

public interface Credencial extends ItemProtocolo{
	
	public void setUser(String user);
	public void setPasswd(String passwd);
	public void valid() throws Exception;

}
