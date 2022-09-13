package br.org.serratec.model;

public class Diretor extends Funcionario {
	private String categoria;

	public Diretor(String nome, String email, Double valor, String categoria) {
		super(nome, email, valor);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Diretor [categoria=" + categoria + "]";
	}

	public String getCategoria() {
		return categoria;
	}

}
