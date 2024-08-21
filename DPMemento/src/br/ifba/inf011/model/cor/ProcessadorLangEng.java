package br.ifba.inf011.model.cor;

import br.ifba.inf011.model.Mensagem;

public class ProcessadorLangEng extends TMProcessadorHandler implements Processador{

	public ProcessadorLangEng() {
		super();
	}
	
	public ProcessadorLangEng(Processador proximo) {
		super(proximo);
	}
	
	@Override
	protected void doProcessar(Mensagem m) {
		m.addHandled("ENG", "HELLO");
	}

	@Override
	protected boolean possoProcessar(Mensagem m) {
		return m.getHeaderValue("LANGUAGE_ENG").equalsIgnoreCase("ENG");
	}	

}
