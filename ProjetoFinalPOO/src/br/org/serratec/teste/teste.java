package br.org.serratec.teste;

import java.io.File;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.model.Funcionario;

public class teste {

	public static void main(String[] args) {

		File arquivo = new File("/exemplos/testeee.txt");

		try {
			Scanner sc = new Scanner(arquivo);
			Set<Funcionario> funcionarios = new HashSet<>();

			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");

					LocalDate dataNasc = LocalDate.parse(vetor[2]);
					Double salarioBruto = Double.parseDouble(vetor[3]);

					funcionarios.add(new Funcionario(vetor[0], vetor[1], dataNasc, salarioBruto, null));
				}
			}
			sc.close();
			System.out.println("------Dados do arquivo--------");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
