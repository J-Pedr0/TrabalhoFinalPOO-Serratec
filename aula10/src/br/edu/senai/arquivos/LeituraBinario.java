package br.edu.senai.arquivos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeituraBinario {

	public static void main(String[] args) {

		try {
			// File file = new File("/exemplos/teste.dat");
			FileInputStream arquivo = new FileInputStream("/exemplos/teste.dat");
			DataInputStream lerArquivo = new DataInputStream(arquivo);
			String resultado = lerArquivo.readLine();
			System.out.println(resultado);
			lerArquivo.close();
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado!");
		}

	}

}
