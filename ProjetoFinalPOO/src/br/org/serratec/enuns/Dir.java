package br.org.serratec.enuns;

public enum Dir {
	D1(142.80), D2(354.80), D3(636.13), D4(869.36), valorDependente(189.59);

	public Double valorDir;

	private Dir(Double valorDir) {
		this.valorDir = valorDir;
	}

	public Double getValorDir() {
		return valorDir;
	}

}
