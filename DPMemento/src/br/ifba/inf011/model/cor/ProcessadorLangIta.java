package br.ifba.inf011.model.cor;

import br.ifba.inf011.model.Mensagem;

public class ProcessadorLangIta extends TMProcessadorHandler implements Processador{
	

	public ProcessadorLangIta() {
		super();
	}
	
	public ProcessadorLangIta(Processador proximo) {
		super(proximo);
	}
	
	@Override
	protected void doProcessar(Mensagem m) {
		m.addHandled("ITA", "CIAO");
	}

	@Override
	protected boolean possoProcessar(Mensagem m) {
		return m.getHeaderValue("LANGUAGE_ITA").equalsIgnoreCase("ITA");
	}	
	

}
