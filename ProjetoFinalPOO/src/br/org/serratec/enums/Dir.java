package br.org.serratec.enums;

public enum Dir {
	DEDUCAO1(142.80), DEDUCAO2(354.80), DEDUCAO3(636.13), DEDUCAO4(869.36), valorDependente(189.59);

	public Double valorDir;

	private Dir(Double valorDir) {
		this.valorDir = valorDir;
	}

	public Double getValorDir() {
		return valorDir;
	}

}
