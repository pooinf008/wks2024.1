package br.ifba.inf011.model.state;

import java.util.Map;

import javax.naming.OperationNotSupportedException;

public class AssinadaState extends AbstractMensagemState implements MensagemState {

	@Override
	public void addHeader(String key, String value, Map<String, String> header) throws OperationNotSupportedException {
		if(!key.equalsIgnoreCase("MAT"))
			throw new OperationNotSupportedException();
		header.put(key, value);
		
	}

}
