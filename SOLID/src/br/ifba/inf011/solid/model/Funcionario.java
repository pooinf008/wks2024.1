package br.ifba.inf011.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.ifba.inf011.solid.model.service.Promovivel;
import br.ifba.inf011.solid.model.service.Reajustavel;

public class Funcionario implements Promovivel, Reajustavel{
	
	private DadosCadastrais data = new DadosCadastrais();

	public Funcionario(String nome, String matricula, String cpf, Cargo cargo, BigDecimal salario,
			LocalDate dataUltimoReajuste) {
		super();
		this.data.nome = nome;
		this.data.matricula = matricula;
		this.data.cpf = cpf;
		this.data.cargo = cargo;
		this.data.salario = salario;
		this.data.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public void reajustar(BigDecimal novoSalario) {
		this.data.salario = novoSalario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + data.nome + ", matricula=" + data.matricula + ", cpf=" + data.cpf + ", cargo=" + data.cargo
				+ ", salario=" + data.salario + ", dataUltimoReajuste=" + data.dataUltimoReajuste + "]";
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
	
	public void promover() {
		this.data.promover();
	}
	



	
}
