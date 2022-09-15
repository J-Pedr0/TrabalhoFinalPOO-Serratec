//package br.org.serratec.teste;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import br.org.serratec.model.Dependente;
//import br.org.serratec.model.Funcionario;
//
//public class TesteFuncionario {
//
//	public static void main(String[] args) {
//		List<Dependente> dependentes = new ArrayList<Dependente>();
//
//		dependentes.add(new Dependente("João", "123456789", LocalDate.of(2022, 9, 9), "outros"));
//		dependentes.add(new Dependente("Marcelle", "123456789", LocalDate.of(2022, 9, 9), "Filha"));
//
//		Funcionario funcionario = new Funcionario("Matheus", "123456789", LocalDate.of(2022, 6, 23), 7000., dependentes);
//
//		System.out.printf("%.2f\n", funcionario.calculoInss());
//
//		System.out.printf("%.2f\n", funcionario.calculoIr());
//
//		System.out.printf("%.2f", funcionario.calculoSalLiq());
//
//	}
//
//}
