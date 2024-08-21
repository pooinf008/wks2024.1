package br.ifba.inf011.model;

import java.util.List;

import br.ifba.inf011.model.cor.Processador;

public class ProcessadorMensagem {
	
	private Processador cor;
	
	public ProcessadorMensagem(Processador cor) {
		this.cor = cor;
	}
	
	public void processar(Mensagem m) {
		this.cor.processar(m);
	}
	
/*	public void processar(Mensagem m) {
		if(m.getHeaderValue("LANGUAGE").equalsIgnoreCase("ENG")) {
			m.addHandled("ENG", "HELLO");
		}else if(m.getHeaderValue("LANGUAGE").equalsIgnoreCase("ITA")) {
			m.addHandled("ITA", "CIAO");
		}else if(m.getHeaderValue("MAT").equalsIgnoreCase("CONTAR")) {
			String conteudo = m.getConteudo();
			String size = Integer.toString(conteudo.length());
			m.addHandled("TAMANHO", size);
		}else if(m.getHeaderValue("COMPACT").equalsIgnoreCase("NO_A")) {
			String conteudo = m.getConteudo();
			String handled = conteudo.replace("A", "");
			m.addHandled("COMPACT_NO_A", handled);
		}else if(m.getHeaderValue("COMPACT").equalsIgnoreCase("NO_SPACE")) {
			String conteudo = m.getConteudo();
			String handled = conteudo.replace(" ", "");
			m.addHandled("COMPACT_NO_BLANK", handled);
		}
		
		
	}
*/	
	


}
