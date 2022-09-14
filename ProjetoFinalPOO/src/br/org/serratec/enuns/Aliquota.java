package br.org.serratec.enuns;

public enum Aliquota {
	ALIQUOTA1(0.075), ALIQUOTA2(0.09), ALIQUOTA3(0.12), ALIQUOTA4(0.14), ALIQUOTA5(0.15), ALIQUOTA6(0.225),
	ALIQUOTA7(0.275);

	public Double valorAliquota;

	private Aliquota(Double valorAliquota) {
		this.valorAliquota = valorAliquota;
	}

	public Double getValorAliquota() {
		return valorAliquota;
	}

}
