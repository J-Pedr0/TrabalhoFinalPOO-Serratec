package br.org.serratec.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Dependente;
import br.org.serratec.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		List<Dependente> dependentes = new ArrayList<Dependente>();

		dependentes.add(new Dependente("João", 123456789, LocalDate.of(2022, 9, 9), "outros"));
		dependentes.add(new Dependente("Marcelle", 123456789, LocalDate.of(2022, 9, 9), "Filha"));

		Funcionario funcionario = new Funcionario("Matheus", 123456789, LocalDate.of(2022, 6, 23), 1500., dependentes);

		System.out.printf("%.2f\n",funcionario.calculoInss());
		
		System.out.printf("%.2f\n", funcionario.calculoIr());
		
		System.out.printf("%.2f", funcionario.calculoSalLiq());

//		File arquivo = new File("/exemplos/empregados.txt");
//
//		try {
//			Scanner sc = new Scanner(arquivo);
//			Set<Funcionario> funcionarios = new HashSet<>();
//
//			while (sc.hasNextLine()) {
//				String linha = sc.nextLine();
//				if (!linha.isEmpty()) {
//					String vetor[] = linha.split(";");
//					funcionarios.add(new Funcionario(vetor[0], vetor[1], vetor[2], vetor[3]));
//				}
//			}
//			sc.close();
//			System.out.println("------Dados do arquivo--------");
//			for (Funcionario funcionario : funcionarios) {
//				System.out.println(funcionario);
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		


	}

}
