package br.org.serratec.model;

import br.org.serratec.interfaces.Calculo;

public class Funcionario implements Calculo {

	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIr;
	private Dependente dependente;

	public Funcionario(Double salarioBruto, Double decontoInss, Double decontoIr, Dependente dependente) {
		super();
		this.salarioBruto = salarioBruto;
		this.descontoInss = decontoInss;
		this.descontoIr = decontoIr;
		this.dependente = dependente;
	}

	@Override
	public String toString() {
		return "Salário bruto do funcionário: " + salarioBruto + " || Desconto INSS: " + descontoInss
				+ " || Deconto Imposto de Renda: " + descontoIr + " || Dependente: " + dependente;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Double getDecontoInss() {
		return descontoInss;
	}

	public Double getDecontoIr() {
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
	public Double caculoSalLiq() {
		// TODO Auto-generated method stub
		return null;
	}

}
