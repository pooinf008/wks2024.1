package br.ifba.inf011.model.state;

import java.util.Map;

import javax.naming.OperationNotSupportedException;

public abstract class AbstractMensagemState implements MensagemState {

	@Override
	public void addHeader(String key, String value, Map<String, String> header) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public String setConteudo(String conteudo) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public MensagemState assinar() throws OperationNotSupportedException {
		return this;
	}

	@Override
	public MensagemState selar() throws OperationNotSupportedException {
		return this;
	}

	@Override
	public MensagemState editar() throws OperationNotSupportedException {
		return this;
	}

}
