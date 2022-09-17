package br.org.serratec.model;

import javax.swing.JOptionPane;

public class EntradaDiretorio {

	public static String entradaComDiretorio() {
		String diretorio1 = JOptionPane.showInputDialog("Informe o diretório de entrada: ");
		return diretorio1;
	}

	public static String sairComDiretorio() {
		String diretorio2 = JOptionPane.showInputDialog("Informe o diretório de saída: ");
		return diretorio2;
	}

}
