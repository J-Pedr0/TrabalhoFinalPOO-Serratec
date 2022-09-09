package br.org.serratec.model;

import java.time.LocalDate;

public class Dependente extends Pessoa {

	private String parentesco;

	public Dependente(String nome, int cpf, LocalDate dataNasce, String parentesco) {
		super(nome, cpf, dataNasce);
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "Dependente parentesco: " + parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}

}
