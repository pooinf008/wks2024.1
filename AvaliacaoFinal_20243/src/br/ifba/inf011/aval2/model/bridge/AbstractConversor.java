package br.ifba.inf011.aval2.model.bridge;

import java.text.DecimalFormat;

public abstract class AbstractConversor {
	
	public String toASCII(String codificada) {
		int iCont = 0;
		StringBuffer conteudo = new StringBuffer();
		while(iCont * this.blockSize() < codificada.length()) {
			int inicio = iCont * this.blockSize();
			int fim = (iCont + 1) * this.blockSize();
			String value = codificada.substring(inicio, fim);
			conteudo.append(this.toChar(value));
			iCont++;
		}
		return conteudo.toString();		
	}


	public String toCoded(String string) {
		StringBuffer conteudo = new StringBuffer();		
		for(int iCont = 0; iCont < string.length(); iCont++)
			conteudo.append(this.toCode(string.charAt(iCont)));
		return conteudo.toString();		
	}
	
	private String toCode(Character character) {
		StringBuffer format = new StringBuffer();
		for(int iCont = 0; iCont < this.blockSize(); iCont++)
			format.append("0");
		DecimalFormat df = new DecimalFormat(format.toString());
		String conteudo = this.intToCodedString(character);
		return df.format(Integer.parseInt(conteudo));		
	}
	
	private Character toChar(String codificada) {
	    Integer numPalavra = Integer.parseInt(codificada, this.getBase());
	    String characters = Character.toString(numPalavra);
		return characters.charAt(0);		
	}


	protected abstract int getBase();	
	protected abstract int blockSize();
	protected abstract String intToCodedString(char ch);
	

}
