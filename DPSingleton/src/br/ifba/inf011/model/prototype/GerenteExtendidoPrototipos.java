package br.ifba.inf011.model.prototype;

public class GerenteExtendidoPrototipos extends GerentePrototipos{

	private static GerenteExtendidoPrototipos gerente = null;
	
	public static GerentePrototipos instancia() {
		if(GerenteExtendidoPrototipos.gerente == null)
			GerenteExtendidoPrototipos.gerente = new GerenteExtendidoPrototipos();
		return GerenteExtendidoPrototipos.gerente;
	}	
	
	public String getNome() {
		return "Gerente Extendido de Prototipos";
	}
	
}
