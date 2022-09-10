package br.org.serratec.model;

import java.time.LocalDate;
import java.util.List;

import br.org.serratec.interfaces.Calculos;

public class Funcionario extends Pessoa implements Calculos {
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIr;
	private List<Dependente> dependente;
	private Double salarioLiq;

	public Funcionario(String nome, int cpf, LocalDate dataNasc, Double salarioBruto, List<Dependente> dependentes) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
		this.dependente = dependentes;
	}

	@Override
	public String toString() {
		return "Salário bruto do funcionário: " + salarioBruto + "  Desconto INSS: " + descontoInss
				+ "  Deconto Imposto de Renda: " + descontoIr + " || Dependente: " + dependente;
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
		return (Dependente) dependente;
	}

	@Override
	public Double calculoInss() {
		if (salarioBruto <= 1212.) {
			descontoInss = (salarioBruto * 0.075);

		} else if (salarioBruto <= 2427.35) {
			descontoInss = (salarioBruto * 0.09) - 18.18;

		} else if (salarioBruto <= 3641.03) {
			descontoInss = (salarioBruto * 0.12) - 91.00;

		} else if (salarioBruto <= 7087.22) {
			descontoInss = (salarioBruto * 0.14) - 163.82;

		} else {
			descontoInss = (7087.22 * 0.14);
		}

		return descontoInss;
	}

	@Override
	public Double calculoIr() {
		if (salarioBruto <= 1903.98) {
			descontoIr = 0.0;

		} else if (salarioBruto <= 2826.65) {
			descontoIr = ((salarioBruto - (dependente.size() * 189.59) - descontoInss) * 0.075) - 142.80;

		} else if (salarioBruto <= 3751.05) {
			descontoIr = ((salarioBruto - (dependente.size() * 189.59) - descontoInss) * 0.15) - 354.80;

		} else if (salarioBruto <= 4664.68) {
			descontoIr = ((salarioBruto - (dependente.size() * 189.59) - descontoInss) * 0.225) - 636.13;

		} else {
			descontoIr = ((salarioBruto - (dependente.size() * 189.59) - descontoInss) * 0.275) - 869.36;
		}

		return descontoIr;
	}

	@Override
	public Double calculoSalLiq() {
		salarioLiq = getSalarioBruto() - descontoInss - getDescontoIr();

		return salarioLiq;
	}

}
