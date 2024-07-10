package br.ifba.inf011.model;

public abstract class Mensageiro {
		
	public abstract void enviar(String  conteudo) throws Exception ;

	public Mensageiro getComposite() {
		return null;
	}
	
	public void addMensageiro(Mensageiro mensageiro) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	};
	public void removeMensageiro(Mensageiro mensageiro) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	};
	public Mensageiro getMensageiro(int index) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	};
}
