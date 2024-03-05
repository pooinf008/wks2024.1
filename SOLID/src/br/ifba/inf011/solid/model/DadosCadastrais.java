package br.ifba.inf011.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DadosCadastrais {
	public String nome;
	public String matricula;
	public String cpf;
	public Cargo cargo;
	public BigDecimal salario;
	public LocalDate dataUltimoReajuste;

	public DadosCadastrais() {
	}
	
	public void promover() {
		 this.cargo = this.cargo.next();
	}

}