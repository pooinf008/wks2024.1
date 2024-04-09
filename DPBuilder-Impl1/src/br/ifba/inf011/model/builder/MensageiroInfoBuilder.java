package br.ifba.inf011.model.builder;

import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.MensageiroInfo;
import br.ifba.inf011.model.TipoProtocolo;

public class MensageiroInfoBuilder implements MessageBuilder{

	private MensageiroInfo mensageiroInfo;
	
	@Override
	public void reset() {
		this.mensageiroInfo = new MensageiroInfo();
	}

	@Override
	public void setTipoProtocolo(TipoProtocolo tp) {
		this.mensageiroInfo.add("Tipo Protocolo", tp.nome());
	}

	@Override
	public void setConfiavel(Boolean confiavel) {
		this.mensageiroInfo.add("Confiavel", confiavel.toString());
	}

	@Override
	public void setSeguro(Boolean seguro) {
		this.mensageiroInfo.add("Seguro", seguro.toString());
	}

	@Override
	public void setCompactador(Compactador compactador) {
		this.mensageiroInfo.add("Compactador", compactador.getClass().getName());
	}
	
	public MensageiroInfo getMensageiroInfo() {
		return this.mensageiroInfo;
	}

}
