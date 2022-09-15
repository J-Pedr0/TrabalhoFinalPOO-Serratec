//package br.org.serratec.teste;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import br.org.serratec.model.Dependente;
//import br.org.serratec.model.Funcionario;
//
//public class testando {
//
//	public static void main(String[] args) {
//
//		Path caminho = Paths.get("c:\\TesteArquivo\\empregados.txt");
//
//		try {
//			byte[] texto = Files.readAllBytes(caminho);
//			String teste = new String(texto);
//			Set<Funcionario> funcionarios = new HashSet<>();
//			StringBuilder sb = new StringBuilder();
//
//			String[] testando = teste.split("\n\n");
//
//			for (String testando1 : testando) {
//				System.out.println(testando1 + "AAAAAAAAAAAAAAAAAAA");
//			}
//
//			System.out.println(teste);
//
////			while (sc.hasNextLine()) {
////				String linha = sc.nextLine();
////				sb.append(sc.nextLine());
////				System.out.println(sb);
////					
////					
////			}
////			sc.close();
//
//			for (Funcionario funcionario : funcionarios) {
//				System.out.println(funcionario);
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//
//}


/*
 * c==================================================================================================================
 * ==================================================================================================================
 * ==================================================================================================================
 * ==================================================================================================================
 */


//package br.org.serratec.teste;
//
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;
//import java.util.Set;
//
//import br.org.serratec.model.Funcionario;
//import br.org.serratec.model.LeituraArquivo;
//
//public class TesteLeitura {
//
//	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat("0.00");
//		df.setRoundingMode(RoundingMode.HALF_UP);
//
//		try {
//			LeituraArquivo leituraArquivo = new LeituraArquivo("c:\\TesteArquivo\\empregados.txt");
//			Set<Funcionario> funcionarios = leituraArquivo.LerArquivo();
//
//			for (Funcionario funcionario2 : funcionarios) {
//
////				System.out.println(
////						"\n============================================================================================================\n"
////								+ funcionario2);
//
//				System.out.printf(
//						"\n=================================================================================================================\n"
//								+ "%s \nINSS: %.2f \nImposto de Renda: %.2f \nSalário Líquido: %.2f \n\n",
//						funcionario2, funcionario2.calculoInss(), funcionario2.calculoIr(),
//						funcionario2.calculoSalLiq());
//
////				System.out.printf("INSS: %.2f\n", funcionario2.calculoInss());
////
////				System.out.printf("Imposto de Renda: %.2f\n", funcionario2.calculoIr());
////
////				System.out.printf("Salário Líquido: %.2f", funcionario2.calculoSalLiq());
////				System.out.println("\n");
////				System.out.println(
////						"\n======================================================================================================\n\n");
//
//				FileWriter arquivoGravar = new FileWriter("c:\\TesteArquivo\\testando-gravar.txt");
//				PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
//				for (Funcionario f : funcionarios) {
//					String linha = f.getNome() + ";" + f.getCpf() + ";" + df.format(f.calculoInss()) + ";"
//							+ df.format(f.calculoIr()) + ";" + df.format(f.calculoSalLiq()) + "\n";
//
//					gravacaoArquivo.printf(linha);
//				}
//				gravacaoArquivo.close();
//			}
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//}
//
