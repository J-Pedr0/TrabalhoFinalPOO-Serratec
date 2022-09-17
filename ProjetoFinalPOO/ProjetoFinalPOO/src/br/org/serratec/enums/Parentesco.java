package br.org.serratec.enums;

public enum Parentesco {
	Filho("Filho(a)"), Sobrinho("Sobrinho(a)"), Outros("Outros");
	
	public String parentesco;

	private Parentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	

}
