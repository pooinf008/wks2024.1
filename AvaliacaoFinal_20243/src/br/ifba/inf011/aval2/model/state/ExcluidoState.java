package br.ifba.inf011.aval2.model.state;

public class ExcluidoState extends AbstractArquivoState implements ArquivoState {


	@Override
	public ArquivoState recuperar() throws UnsupportedOperationException {
		return new NormalState();
	}



	@Override
	public Long getTamanho(String conteudo) throws IllegalAccessException {
		return 0L;
	}

}
