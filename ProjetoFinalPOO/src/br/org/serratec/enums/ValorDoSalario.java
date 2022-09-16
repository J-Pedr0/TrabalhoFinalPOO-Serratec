package br.org.serratec.enums;

public enum ValorDoSalario {
	SALARIO1(1212.), SALARIO2(2427.35), SALARIO3(3641.03), SALARIO4(7087.22)
	, SALARIO5(1903.98), SALARIO6(2826.65), SALARIO7(3751.05), SALARIO8(4664.68);

	public Double valorSalario;

	private ValorDoSalario(Double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public Double getValorSalario() {
		return valorSalario;
	}

}
