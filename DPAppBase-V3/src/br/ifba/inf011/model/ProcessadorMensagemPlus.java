package br.ifba.inf011.model;

public class ProcessadorMensagemPlus extends ProcessadorMensagem{
	
	@Override
	public void processar(Mensagem m) {
		super.processar(m);
		if(m.getHeaderValue("MAT").equalsIgnoreCase("SUBS_NUM")) {
			String conteudo = m.getConteudo();
			String handled = conteudo.replace("1", "*").replace("2", "*");
			m.addHandled("NO_NUMBER", handled);
		}		
	}

}
