package br.org.serratec.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

import br.org.serratec.exception.DependenteException;

public class Dependente extends Pessoa {
	private String parentesco;

	public Dependente(String nome, String cpf, LocalDate dataNasc, String parentesco) {
		super(nome, cpf, dataNasc);
		this.parentesco = parentesco;
	}

	@Override
	public String toString() {
		return "Dependente [parentesco=" + parentesco + ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc
				+ "]";
	}

	public String getParentesco() {
		return parentesco;
	}

	public static Boolean verificarParentesco(String parentesco) {
		if (parentesco == "Filho" || parentesco == "Sobrinho(a)" || parentesco == "Outro") {
			return true;
		} else {
			throw new DependenteException(
					"Este dependente não tem o parentesco permitido! Assim não contará para dedução!");
		}

	}

	public static Boolean verificarIdade(LocalDate dataNascimento) {
		LocalDate dataAtual = LocalDate.now();

		Period period = Period.between(dataNascimento, dataAtual);

		if (period.getYears() < 18) {
			return true;
		} else {
			throw new DependenteException("Este dependente é maior de idade! Assim não contará para dedução!");

		}

	}

}
