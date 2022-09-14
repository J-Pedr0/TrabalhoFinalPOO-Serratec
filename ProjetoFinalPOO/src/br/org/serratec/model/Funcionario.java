package br.org.serratec.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.org.serratec.enuns.Aliquota;
import br.org.serratec.enuns.Dinss;
import br.org.serratec.enuns.Dir;
import br.org.serratec.enuns.ValorDoSalario;
import br.org.serratec.interfaces.Calculos;

public class Funcionario extends Pessoa implements Calculos {
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIr;
	private List<Dependente> dependente;
	private Double salarioLiq;

	public Funcionario(String nome, String cpf, LocalDate dataNasc, Double salarioBruto, List<Dependente> dependente) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
		this.dependente = dependente;
	}

	public Funcionario(String nome, String cpf, LocalDate dataNasc, Double salarioBruto) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
		this.dependente = new ArrayList<Dependente>();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " cpf: " + cpf + " Data de nascimento: " + dataNasc + " Salario: " + salarioBruto
				+ "|| Dependentes:" + dependente;
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

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public void setDescontoInss(Double descontoInss) {
		this.descontoInss = descontoInss;
	}

	public void setDescontoIr(Double descontoIr) {
		this.descontoIr = descontoIr;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}

	public void setSalarioLiq(Double salarioLiq) {
		this.salarioLiq = salarioLiq;
	}

	@Override
	public Double calculoInss() {
		if (salarioBruto <= ValorDoSalario.SALARIO1.valorSalario) {
			descontoInss = (salarioBruto * Aliquota.ALIQUOTA1.valorAliquota);

		} else if (salarioBruto <= ValorDoSalario.SALARIO2.valorSalario) {
			descontoInss = (salarioBruto * Aliquota.ALIQUOTA2.valorAliquota) - Dinss.D1.valorDinss;

		} else if (salarioBruto <= ValorDoSalario.SALARIO3.valorSalario) {
			descontoInss = (salarioBruto * Aliquota.ALIQUOTA3.valorAliquota) - Dinss.D2.valorDinss;

		} else if (salarioBruto <= ValorDoSalario.SALARIO4.valorSalario) {
			descontoInss = (salarioBruto * Aliquota.ALIQUOTA4.valorAliquota) - Dinss.D3.valorDinss;

		} else {
			descontoInss = (ValorDoSalario.SALARIO4.valorSalario * Aliquota.ALIQUOTA4.valorAliquota)
					- Dinss.D3.valorDinss;
		}

		return descontoInss;
	}

	@Override
	public Double calculoIr() {
		if (salarioBruto <= ValorDoSalario.SALARIO5.valorSalario) {
			descontoIr = 0.0;

		} else if (salarioBruto <= ValorDoSalario.SALARIO6.valorSalario) {
			descontoIr = ((salarioBruto - (dependente.size() * Dir.valorDependente.valorDir) - descontoInss)
					* salarioBruto * Aliquota.ALIQUOTA1.valorAliquota) - Dir.D1.valorDir;

		} else if (salarioBruto <= ValorDoSalario.SALARIO7.valorSalario) {
			descontoIr = ((salarioBruto - (dependente.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Aliquota.ALIQUOTA5.valorAliquota) - Dir.D2.valorDir;

		} else if (salarioBruto <= ValorDoSalario.SALARIO8.valorSalario) {
			descontoIr = ((salarioBruto - (dependente.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Aliquota.ALIQUOTA6.valorAliquota) - Dir.D3.valorDir;

		} else {
			descontoIr = ((salarioBruto - (dependente.size() * Dir.valorDependente.valorDir) - descontoInss)
					* Aliquota.ALIQUOTA7.valorAliquota) - Dir.D4.valorDir;
		}

		return descontoIr;
	}

	@Override
	public Double calculoSalLiq() {
		salarioLiq = getSalarioBruto() - descontoInss - getDescontoIr();

		return salarioLiq;
	}

	public void adicionarDependente(Dependente dependente) {
		this.dependente.add(dependente);
	}

}
