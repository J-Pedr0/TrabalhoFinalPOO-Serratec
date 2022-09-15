package br.org.serratec.enuns;

public enum Parentescos {
	Filho("Filho(a)"), Sobrinho("Sobrinho(a)"), Outros("Outros");

	public String parentesco;

	private Parentescos(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}

}
