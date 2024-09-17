package br.ifba.inf011.aval2.model.state;

public class BloqueadoState extends AbstractArquivoState implements ArquivoState {

	@Override
	public ArquivoState liberar() throws UnsupportedOperationException {
		return new NormalState();
	}

	@Override
	public Long getTamanho(String conteudo) throws IllegalAccessException {
		return Long.valueOf(conteudo.length());
	}

}
