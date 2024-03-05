package br.ifba.inf011.solid;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.ifba.inf011.solid.exception.RHException;
import br.ifba.inf011.solid.model.Cargo;
import br.ifba.inf011.solid.model.Funcionario;
import br.ifba.inf011.solid.model.Terceirizado;
import br.ifba.inf011.solid.model.service.OCPReajustadorSalarios;
import br.ifba.inf011.solid.model.service.Promotor;
import br.ifba.inf011.solid.model.service.ReajustadorSalarios;
import br.ifba.inf011.solid.model.service.ReajustadorSalariosNovo;
import br.ifba.inf011.solid.model.service.regras.Regra;
import br.ifba.inf011.solid.model.service.regras.RegraReajusteJunior15;
import br.ifba.inf011.solid.model.service.regras.RegraReajusteLetra;
import br.ifba.inf011.solid.model.service.regras.RegraReajusteMax30;
import br.ifba.inf011.solid.model.service.Reajustador;

public class App {
	
	
	public void runOCP(Reajustador reajustadorExterno) throws RHException{
		
		Reajustador reajustador = reajustadorExterno;
		Promotor promotor = new Promotor();
		
		Funcionario func = new Funcionario("Zé", "0001",
									       "00100101111",
									       Cargo.PLENO,
									       new BigDecimal("1000.0"),
									       LocalDate.now()
									       );
		
		Terceirizado func2 = new Terceirizado("Zé", "0001",
			       							  "00100101111",
			       							  Cargo.PLENO,
			       							  new BigDecimal("1000.0"),
			       							  LocalDate.now(),
			       							  "ABC"
			       								);
		
		
		System.out.println(func);
		System.out.println("*********************");
		System.out.println(func2);
		
		reajustador.reajustar(func, new BigDecimal("0.25"));
		promotor.promover(func);
		promotor.promover(func2);
		
		System.out.println(func);
		System.out.println(func2);

		
	}
	
	
	public void run() throws RHException {
		
		ReajustadorSalarios reajustador = new ReajustadorSalariosNovo();
		
		Funcionario func = new Funcionario("Zé", "0001",
									       "00100101111",
									       Cargo.SENIOR,
									       new BigDecimal("1000.0"),
									       LocalDate.now()
									       );
		System.out.println(func);
		
		reajustador.reajustar(func, new BigDecimal("0.25"));
		
		System.out.println(func);
		
		
		
	}
	
	public static void main(String[] args) throws RHException {
		List<Regra> regras = new ArrayList<Regra>();
		regras.add(new RegraReajusteMax30());
		regras.add(new RegraReajusteJunior15());
		regras.add(new RegraReajusteLetra('Z'));
//		(new App()).runOCP(new OCPReajustadorSalarios(regras));
		(new App()).runOCP(new ReajustadorSalarios());		
	}

}
