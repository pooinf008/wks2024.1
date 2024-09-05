package br.ifba.inf011.aval2.model.state;

import br.ifba.inf011.aval2.model.Credencial;

public class SomenteLeituraState extends AbstractArquivoState implements ArquivoState {

	@Override
	public ArquivoState bloquear() throws UnsupportedOperationException {
		return new BloqueadoState();
	}

	@Override
	public ArquivoState liberar() throws UnsupportedOperationException {
		return new NormalState();
	}

	@Override
	public String ler(Credencial credencial, String conteudo) throws IllegalAccessException {
		return conteudo;
	}

	@Override
	public Long getTamanho(String conteudo) throws IllegalAccessException {
		return Long.valueOf(conteudo.length());
	}	

}
