package br.ifba.inf011.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.ifba.inf011.solid.model.service.Promovivel;

public class Terceirizado implements Promovivel{
	
	private DadosCadastrais data = new DadosCadastrais();
	private String empresa;
	
	public Terceirizado(String nome, String matricula, String cpf, Cargo cargo, BigDecimal salario,
			LocalDate dataUltimoReajuste, String empresa) {	
		this.data.nome = nome;
		this.data.matricula = matricula;
		this.data.cpf = cpf;
		this.data.cargo = cargo;
		this.data.salario = salario;
		this.data.dataUltimoReajuste = dataUltimoReajuste;
		this.empresa = empresa;
	}

	
	@Override
	public String toString() {
		return "Terceirizado [empresa=" + empresa + " nome=" + data.nome + ", matricula=" + data.matricula + ", cpf=" + data.cpf + ", cargo=" + data.cargo
				+ ", salario=" + data.salario + ", dataUltimoReajuste=" + data.dataUltimoReajuste + "]";
	}
	
	public void promover() {
		this.data.promover();
	}
	
	public BigDecimal getSalario() {
		return this.data.salario;
	}

	public Cargo getCargo() {
		return this.data.cargo;
	}

	public String getNome() {
		return this.data.nome;
	}	
		

}
