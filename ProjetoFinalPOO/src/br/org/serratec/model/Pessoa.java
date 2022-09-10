package br.org.serratec.model;

import java.time.LocalDate;

public abstract class Pessoa {
	protected String nome;
	protected int cpf;
	protected LocalDate dataNasc;

	public Pessoa(String nome, int cpf, LocalDate dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Nome da pessoa: " + nome + " Cpf da pessoa:" + cpf + " Data de Nascimento: " + dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

}
