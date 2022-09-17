package br.org.serratec.enums;

public enum Dinss {
	DEDUCAO1(18.18), DEDUCAO2(91.00), DEDUCAO3(163.82);

	public Double valorDinss;

	private Dinss(Double valorDinss) {
		this.valorDinss = valorDinss;
	}

	public Double getValorDinss() {
		return valorDinss;
	}

}
