package br.ifba.inf011.model.cor;

import br.ifba.inf011.model.Mensagem;

public abstract class TMProcessadorHandler implements Processador{

	private Processador proximo;
	
	public TMProcessadorHandler(Processador proximo) {
		this.proximo = proximo;
	}
	
	public TMProcessadorHandler() {
		this(null);
	}
	
	@Override
	public final void processar(Mensagem m) {
		if(this.possoProcessar(m)) {
			this.doProcessar(m);
//			return;
		}	
		this.repassa(m);
	}

	protected void repassa(Mensagem m) {
		if(this.proximo!= null)
			this.proximo.processar(m);
		return;
	}

	protected abstract void doProcessar(Mensagem m);
	protected abstract boolean possoProcessar(Mensagem m);
	
	

}
