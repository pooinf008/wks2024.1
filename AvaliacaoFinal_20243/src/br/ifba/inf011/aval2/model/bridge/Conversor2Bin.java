package br.ifba.inf011.aval2.model.bridge;

import java.text.DecimalFormat;

public class Conversor2Bin {
	
	public static int BIN_BLOCK_SIZE = 8;
	public static int BASE = 2;	

	public String toASCII(String codificada) {
		int iCont = 0;
		StringBuffer conteudo = new StringBuffer();
		while(iCont * Conversor2Bin.BIN_BLOCK_SIZE < codificada.length()) {
			int inicio = iCont * Conversor2Bin.BIN_BLOCK_SIZE;
			int fim = (iCont + 1) * Conversor2Bin.BIN_BLOCK_SIZE;
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
		DecimalFormat df = new DecimalFormat("00000000");
		String conteudo = Integer.toBinaryString((int) character);
		return df.format(Integer.parseInt(conteudo));		
	}
	
	private Character toChar(String codificada) {
	    Integer numPalavra = Integer.parseInt(codificada, 2);
	    String characters = Character.toString(numPalavra);
		return characters.charAt(0);		
	}
	
	

}
