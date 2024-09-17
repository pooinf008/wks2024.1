package br.ifba.inf011.aval2.model.bridge;

public class Hexa implements Tipo{
	
	private Conversor2Hex conversor;
	
	public Hexa() {
		this.conversor = new Conversor2Hex();
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
  		Hexa h = new Hexa();
		System.out.println(h.write("UM ARQUIVO CODIFICADO EM HEXADECIMAL"));
		System.out.println(h.read("554D204152515549564F20434F444946494341444F20454D2048455841444543494D414C"));
	}

}
