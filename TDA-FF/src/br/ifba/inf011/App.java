package br.ifba.inf011;

import java.util.Map;

public class App {
	
	private void run() throws HotelLotadoException, ModoReservaException {
		Hotel hotel = new Hotel(3,4);
		hotel.modoReserva();
		System.out.println(hotel.toString());
		Integer numQuarto = hotel.reservar();
		System.out.println("Quarto reservado: " + numQuarto);
		Integer numQuarto2 = hotel.reservar();
		System.out.println("Quarto reservado: " + numQuarto2);
		Integer numQuarto3 = hotel.reservar();
		System.out.println("Quarto reservado: " + numQuarto3);
		
		System.out.println("\n\n" + hotel.toString());
		
		
		System.out.println("\n\n" + hotel.representacaoStrQuarto(202));
	}
		
	
	
	public static void main(String[] args) throws HotelLotadoException, ModoReservaException {
		(new App()).run();
	}

}
