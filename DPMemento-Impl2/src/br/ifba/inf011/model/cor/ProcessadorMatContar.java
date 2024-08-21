package br.ifba.inf011.model.cor;

import br.ifba.inf011.model.Mensagem;

public class ProcessadorMatContar extends TMProcessadorHandler implements Processador{

	public ProcessadorMatContar() {
		super();
	}
	
	public ProcessadorMatContar(Processador proximo) {
		super(proximo);
	}
	
	@Override
	protected void doProcessar(Mensagem m) {
		String conteudo = m.getConteudo();
		String size = Integer.toString(conteudo.length());
		m.addHandled("TAMANHO", size);
	}

	@Override
	protected boolean possoProcessar(Mensagem m) {
		return m.getHeaderValue("TAMANHO").equalsIgnoreCase("CONTAR");
	}	

}
