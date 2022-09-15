package br.org.serratec.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected LocalDate dataNasc;

	public Pessoa(String nome, String cpf, LocalDate dataNasc) {
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

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	

}
