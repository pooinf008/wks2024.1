package br.ifba.inf011.solid.exception;

public class RHException extends Exception {
	
	private String message;

	public RHException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
	
	
	
	
	

}
