package br.ifba.inf011.model.af;

import br.ifba.inf011.model.Credencial;

public interface ProtocoloAbstractFactoryEstendida extends ProtocoloAbstractFactory{
	public Credencial createCredencial();

}
