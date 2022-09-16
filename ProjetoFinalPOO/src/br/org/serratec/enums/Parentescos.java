package br.org.serratec.enums;

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
