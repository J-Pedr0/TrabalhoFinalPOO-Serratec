package br.org.serratec.enums;

public enum Dinss {
	D1(18.18), D2(91.00), D3(163.82);

	public Double valorDinss;

	private Dinss(Double valorDinss) {
		this.valorDinss = valorDinss;
	}

	public Double getValorDinss() {
		return valorDinss;
	}

}
