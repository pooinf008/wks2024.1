package br.ifba.inf011.aval2.model.bridge;

public class Texto implements Tipo{

	@Override
	public String write(String value) {
		return value;
	}

	@Override
	public String read(String content) {
		return content;
	}

}
