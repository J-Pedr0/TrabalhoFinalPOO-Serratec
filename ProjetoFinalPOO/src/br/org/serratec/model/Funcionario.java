package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.interfaces.Calculos;

public class Funcionario extends Pessoa implements Calculos {
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIr;
	private Dependente dependente;

	public Funcionario(String nome, int cpf, LocalDate dataNasc, Double salarioBruto, Double descontoInss,
			Double descontoIr, Dependente dependente) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
		this.descontoInss = descontoInss;
		this.descontoIr = descontoIr;
		this.dependente = dependente;
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
		return dependente;
	}

	@Override
	public Double calculoInss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculoIr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculoSalLiq() {
		// TODO Auto-generated method stub
		return null;
	}

}
