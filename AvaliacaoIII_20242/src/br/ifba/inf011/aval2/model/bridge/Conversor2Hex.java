package br.ifba.inf011.aval2.model.bridge;

public class Conversor2Hex {
	
	public static int HEX_BLOCK_SIZE = 2;
	public static int BASE = 16;	
	
	
	
	public String toASCII(String codificada) {
		int iCont = 0;
		StringBuffer conteudo = new StringBuffer();
		while(iCont * Conversor2Hex.HEX_BLOCK_SIZE < codificada.length()) {
			int inicio = iCont * Conversor2Hex.HEX_BLOCK_SIZE;
			int fim = (iCont + 1) * Conversor2Hex.HEX_BLOCK_SIZE;
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
		Integer conteudo = (int) character;
		return String.format("%X", conteudo);		
	}
	
	private Character toChar(String codificada) {
	    Integer numPalavra = Integer.parseInt(codificada, 16);
	    String characters = Character.toString(numPalavra);
		return characters.charAt(0);		
	}	

}
