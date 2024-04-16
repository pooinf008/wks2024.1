package br.ifba.inf011.aval1.model;

import br.ifba.inf011.aval1.model.af.ComboPersonagemFactory;
import br.ifba.inf011.aval1.model.af.StarterGuerraGolfoFactory;
import br.ifba.inf011.aval1.model.af.StarterGuerraSecessaoFactory;
import br.ifba.inf011.aval1.model.af.StarterMedievalFactory;
import br.ifba.inf011.aval1.model.builder.ArmaBuilder;
import br.ifba.inf011.aval1.model.builder.PersonagemBuilder;
import br.ifba.inf011.aval1.model.builder.PersonagemDirector;

public class App {
	
	
	public void run(ComboPersonagemFactory cbf) {
		
		PersonagemBuilder personagemBuilder = cbf.getPersonagemBuilder();
		ArmaBuilder armaBuilder = cbf.getArmaBuilder();
		PersonagemDirector director = new PersonagemDirector(personagemBuilder, armaBuilder);
		director.criarStarter();
		Personagem personagem = personagemBuilder.getPersonagem();
		System.out.println(personagem);
	}
	
	
	public static void main(String[] args) {
		App app = new App();
		app.run(new StarterMedievalFactory());
		app.run(new StarterGuerraSecessaoFactory());
		app.run(new StarterGuerraGolfoFactory()); 
	}

}
