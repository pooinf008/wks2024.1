package br.ifba.inf011.model.memento;

public interface Originator<M> {
	public M snapshot();
	public void back(M snap);
}
