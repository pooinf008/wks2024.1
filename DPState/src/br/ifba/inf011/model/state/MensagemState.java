package br.ifba.inf011.model.state;

import java.util.Map;

import javax.naming.OperationNotSupportedException;

public interface MensagemState {
	
	public void addHeader(String key, String value, Map<String, String> header) 
		throws OperationNotSupportedException;
	
	public String setConteudo(String conteudo)
		throws OperationNotSupportedException;
	
	public MensagemState assinar() throws OperationNotSupportedException;
	public MensagemState selar() throws OperationNotSupportedException;	
	public MensagemState editar() throws OperationNotSupportedException;
	public String desc();
	

}
