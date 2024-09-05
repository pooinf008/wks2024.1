package br.ifba.inf011.aval2.model.bridge;

public class Binario implements Tipo{
	
	private Conversor2Bin conversor;
	
	public Binario() {
		this.conversor = new Conversor2Bin();
	}

	@Override
	public String write(String value) {
		return this.conversor.toCoded(value);
	}

	@Override
	public String read(String content) {
		return this.conversor.toASCII(content);
	}
	

  	public static void main(String[] args) {
		Binario b = new Binario();
		System.out.println(b.write("UM ARQUIVO CODIFICADO EM BINARIO"));
		System.out.println(b.read("0101010101001101001000000100000101010010010100010101010101001001010101100100111100100000010000110100111101000100010010010100011001001001010000110100000101000100010011110010000001000101010011010010000001000010010010010100111001000001010100100100100101001111"));
	}
	

}
