package br.org.serratec.model;

import javax.swing.JOptionPane;

public class EntradaDiretorio {

	public static String entrarComDiretorio() {
		String deretorio1 = JOptionPane.showInputDialog("Informe o diretório de entrada: ");
		return deretorio1;
	}
	
	public static String sairComDiretorio() {
		String deretorio2 = JOptionPane.showInputDialog("Informe o diretório saída: ");
		return deretorio2;
	}

}
