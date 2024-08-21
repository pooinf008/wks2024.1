package br.ifba.inf011.model.state;

import java.util.Map;

import javax.naming.OperationNotSupportedException;

public class SeladaState extends AbstractMensagemState implements MensagemState {

	@Override
	public void addHeader(String key, String value, Map<String, String> header) throws OperationNotSupportedException {
		header.put(key, value);
	}

	@Override
	public MensagemState assinar() throws OperationNotSupportedException {
		return new AssinadaState();
	}

	@Override
	public MensagemState editar() throws OperationNotSupportedException {
		return new EditavelState();
	}

}
