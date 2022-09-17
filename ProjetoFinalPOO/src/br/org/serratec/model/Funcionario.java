package br.org.serratec.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.org.serratec.enums.Dinss;
import br.org.serratec.enums.Dir;
import br.org.serratec.enums.Valores;
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

	@Override
	public Double calculoInss() {
		if (salarioBruto <= Valores.VALORES1.valorSalrio) {
			descontoInss = (salarioBruto * Valores.VALORES1.valorAliquota);

		} else if (salarioBruto <= Valores.VALORES2.valorSalrio) {
			descontoInss = (salarioBruto * Valores.VALORES2.valorAliquota) - Dinss.DEDUCAO1.valorDinss;

		} else if (salarioBruto <= Valores.VALORES3.valorSalrio) {
			descontoInss = (salarioBruto * Valores.VALORES3.valorAliquota) - Dinss.DEDUCAO2.valorDinss;

		} else if (salarioBruto <= Valores.VALORES4.valorSalrio) {
			descontoInss = (salarioBruto * Valores.VALORES4.valorAliquota) - Dinss.DEDUCAO3.valorDinss;

		} else {
			descontoInss = (Valores.VALORES5.valorSalrio * Valores.VALORES5.valorAliquota) - Dinss.DEDUCAO3.valorDinss;
		}
		return descontoInss;
	}

	@Override
	public Double calculoIr() {
		if (salarioBruto <= Valores.VALORES5.valorSalrio) {
			descontoIr = 0.0;

		} else if (salarioBruto <= Valores.VALORES6.valorSalrio) {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Valores.VALORES6.valorAliquota) - Dir.DEDUCAO1.valorDir;

		} else if (salarioBruto <= Valores.VALORES7.valorSalrio) {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Valores.VALORES7.valorAliquota) - Dir.DEDUCAO2.valorDir;

		} else if (salarioBruto <= Valores.VALORES8.valorSalrio) {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Valores.VALORES8.valorAliquota) - Dir.DEDUCAO3.valorDir;

		} else {
			descontoIr = ((salarioBruto - (dependentes.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Valores.VALORES9.valorAliquota) - Dir.DEDUCAO4.valorDir;
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
