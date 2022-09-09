package br.org.serratec.model;

import java.time.LocalDate;

public class Pessoa {
	protected String nome;
	protected int cpf;
	protected LocalDate dataNasce;

	public Pessoa(String nome, int cpf, LocalDate dataNasce) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasce = dataNasce;
	}

	@Override
	public String toString() {
		return "Nome da pessoa: " + nome + " || Cpf: " + cpf + " || Data de nascimento: " + dataNasce;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public LocalDate getDataNasce() {
		return dataNasce;
	}

}
