package br.org.serratec.model;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.exception.DependenteException;

public class LeituraArquivo {

	private String diretorio;

	public LeituraArquivo(String diretorio) {
		super();
		this.diretorio = diretorio;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public Set<Funcionario> LerArquivo() throws Exception {

		try {
			File arquivo = new File(diretorio);
			Scanner sc = new Scanner(arquivo);
			Set<Funcionario> funcionarios = new HashSet<>();

			int i = 0;

			Funcionario funcionario = null;
			while (sc.hasNextLine()) {
				DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
				String linha = sc.nextLine();

				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");

					if (i == 0) {
						Double salario = Double.parseDouble(vetor[3]);

						LocalDate dataNascimento = LocalDate.parse(vetor[2], DATEFORMATTER);

						funcionario = new Funcionario(vetor[0], vetor[1], dataNascimento, salario);
						i++;
					} else {
						LocalDate dataNascimento = LocalDate.parse(vetor[2], DATEFORMATTER);
						try {
							String nome = vetor[0];
							Dependente.verificarParentesco(vetor[3], nome);
							Dependente.verificarIdade(dataNascimento, nome);
							funcionario
									.adicionarDependente(new Dependente(vetor[0], vetor[1], dataNascimento, vetor[3]));

						} catch (DependenteException e) {
							System.out.println(e.getMessage() + "\n");
						}

					}
				} else {

					funcionarios.add(funcionario);
					funcionario = null;
					i = 0;
				}
			}

			sc.close();
			return funcionarios;
		} catch (Exception e) {
			System.out.println("Erro! Caminho do arquivo invalido");
			throw new Exception(e.getMessage());
		}

	}

}