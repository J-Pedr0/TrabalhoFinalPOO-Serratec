package br.org.serratec.teste;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Set;

import javax.swing.JOptionPane;

import br.org.serratec.model.EntradaDiretorio;
import br.org.serratec.model.Funcionario;
import br.org.serratec.model.LeituraArquivo;

public class TesteLeitura {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);

		String deretorio1 = EntradaDiretorio.entrarComDiretorio();
		String deretorio2 = EntradaDiretorio.sairComDiretorio();

		try {
			// /exemplos/empregados.txt
			LeituraArquivo leituraArquivo = new LeituraArquivo(deretorio1);
			Set<Funcionario> funcionarios = leituraArquivo.LerArquivo();

			for (Funcionario funcionario2 : funcionarios) {

				System.out.printf(
						"\n=================================================================================================================\n"
								+ "%s \nINSS: R$ %.2f  \nImposto de Renda: R$ %.2f \nSalário Líquido: R$ %.2f \n\n",
						funcionario2, funcionario2.calculoInss(), funcionario2.calculoIr(),
						funcionario2.calculoSalLiq());

				FileWriter arquivoGravar = new FileWriter(deretorio2);
				PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
				for (Funcionario f : funcionarios) {
					String linha = f.getNome() + ";" + f.getCpf() + ";" + df.format(f.calculoInss()) + ";"
							+ df.format(f.calculoIr()) + ";" + df.format(f.calculoSalLiq()) + "\n";

					gravacaoArquivo.printf(linha);
				}
				gravacaoArquivo.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
