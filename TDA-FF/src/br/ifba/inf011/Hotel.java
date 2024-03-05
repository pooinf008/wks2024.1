package br.ifba.inf011;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
	
	private Map<Integer, Boolean> quartos;
	private Integer qtdeAndares;
	private Integer quartosPorAndar;
	private Boolean reservaModo;
	
	public Hotel(Integer andares, Integer quartos) {
		this.qtdeAndares = andares;
		this.quartosPorAndar = quartos;
		this.quartos = new HashMap<Integer, Boolean>();
		for(int iCont = 1; iCont <= this.qtdeAndares; iCont++) 
			for(int jCont = 1; jCont <= this.quartosPorAndar; jCont++) {
				Integer numQuarto = iCont * 100 + jCont;
				this.quartos.put(numQuarto, false);
			}
		this.modoReserva();
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		for(int iCont = 1; iCont <= this.qtdeAndares; iCont++)
			str.append(this.representacaoStrAndar(iCont) + "\n");
		return str.toString();
	}
	
	
	public String representacaoStrAndar(int andar) {
		StringBuffer str = new StringBuffer();
		for(int jCont = 1; jCont <= this.quartosPorAndar; jCont++)
			str.append(this.representacaoStrQuarto(andar * 100 + jCont));
		return str.toString();
	}
	
	public String representacaoStrQuarto(Integer numQuarto) {
		if(!this.quartos.get(numQuarto).booleanValue())
			return "o ";
		return "* ";		
	}

	public Map<Integer, Boolean> getQuartos() {
		return quartos;
	}
	
	
	public Integer reservar() throws HotelLotadoException, ModoReservaException {
		if(!this.reservaModo)
			throw new ModoReservaException();
		for(Integer numQuarto : this.quartos.keySet())
			if(!this.quartos.get(numQuarto).booleanValue()) {
				this.quartos.put(numQuarto, true);
				return numQuarto;
			}
		throw new HotelLotadoException();
	}
	
	public void liberar(Integer numQuarto) {
		this.quartos.put(numQuarto, false);
	}
	
	public void modoReserva() {
		this.reservaModo = true;
	}
	
	public void semModoReserva() {
		this.reservaModo = false;
	}	
	

}
