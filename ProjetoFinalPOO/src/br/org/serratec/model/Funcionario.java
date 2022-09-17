package br.org.serratec.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.org.serratec.enums.Dinss;
import br.org.serratec.enums.Dir;
import br.org.serratec.enums.valores;
import br.org.serratec.interfaces.Calculos;

public class Funcionario extends Pessoa implements Calculos {
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIr;
	private Set<Dependente> dependentes;
	private Double salarioLiq;

	public Funcionario(String nome, String cpf, LocalDate dataNasc, Double salarioBruto) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
		this.dependentes = new HashSet<Dependente>();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " || CPF: " + cpf + " || Data de nascimento: " + dataNasc + " || Salário bruto: "
				+ salarioBruto + " || Quantidade de dependentes: " + dependentes.size() + " || Dependentes: "
				+ dependentes;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Double getDescontoInss() {
		return descontoInss;
	}

	public Double getDescontoIr() {
		return descontoIr;
	}

	public Dependente getDependente() {
		return (Dependente) dependentes;
	}

//	public void setSalarioBruto(Double salarioBruto) {
//		this.salarioBruto = salarioBruto;
//	}
//
//	public void setDescontoInss(Double descontoInss) {
//		this.descontoInss = descontoInss;
//	}
//
//	public void setDescontoIr(Double descontoIr) {
//		this.descontoIr = descontoIr;
//	}
//
//	public void setDependente(Set<Dependente> dependente) {
//		this.dependente = dependente;
//	}
//
//	public void setSalarioLiq(Double salarioLiq) {
//		this.salarioLiq = salarioLiq;
//	}

	@Override
	public Double calculoInss() {
		if (salarioBruto <= valores.VALORES1.valorSalario) {
			descontoInss = (salarioBruto * valores.VALORES1.valorAliquota);

		} else if (salarioBruto <= valores.VALORES2.valorSalario) {
			descontoInss = (salarioBruto * valores.VALORES2.valorAliquota) - Dinss.DEDUCAO1.valorDinss;

		} else if (salarioBruto <= valores.VALORES3.valorSalario) {
			descontoInss = (salarioBruto * valores.VALORES3.valorAliquota) - Dinss.DEDUCAO2.valorDinss;

		} else if (salarioBruto <= valores.VALORES4.valorSalario) {
			descontoInss = (salarioBruto * valores.VALORES4.valorAliquota) - Dinss.DEDUCAO3.valorDinss;

		} else {
			descontoInss = (valores.VALORES4.valorSalario * valores.VALORES4.valorAliquota) - Dinss.DEDUCAO3.valorDinss;
		}

		return descontoInss;
	}

	@Override
	public Double calculoIr() {
		if (salarioBruto <= valores.VALORES5.valorSalario) {
			descontoIr = 0.0;

		} else if (salarioBruto <= valores.VALORES6.valorSalario) {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* valores.VALORES6.valorAliquota) - Dir.DEDUCAO1.valorDir;

		} else if (salarioBruto <= valores.VALORES7.valorSalario) {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* valores.VALORES7.valorAliquota) - Dir.DEDUCAO2.valorDir;

		} else if (salarioBruto <= valores.VALORES8.valorSalario) {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* valores.VALORES8.valorAliquota) - Dir.DEDUCAO3.valorDir;

		} else {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* valores.VALORES9.valorAliquota) - Dir.DEDUCAO4.valorDir;
		}

		return descontoIr;
	}

	@Override
	public Double calculoSalLiq() {
		salarioLiq = getSalarioBruto() - descontoInss - getDescontoIr();

		return salarioLiq;
	}

	public void adicionarDependente(Dependente dependente) {
		this.dependentes.add(dependente);
	}

}
