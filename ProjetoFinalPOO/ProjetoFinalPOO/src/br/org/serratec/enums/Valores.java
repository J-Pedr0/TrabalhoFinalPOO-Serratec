package br.org.serratec.enums;

public enum Valores {
	VALORES1(0.075, 1212.), VALORES2(0.09, 2427.35), VALORES3(0.12, 3641.03), VALORES4(0.14, 7087.22),
	VALORES5(0., 1903.98), VALORES6(0.075, 2826.65), VALORES7(0.15, 3751.05), VALORES8(0.225, 4664.68),
	VALORES9(0.275, 0.);

	public Double valorAliquota;
	public Double valorSalrio;

	private Valores(Double valorAliquota, Double valorSalrio) {
		this.valorAliquota = valorAliquota;
		this.valorSalrio = valorSalrio;
	}

	public Double getValorAliquota() {
		return valorAliquota;
	}

	public Double getValorSalrio() {
		return valorSalrio;
	}

}
