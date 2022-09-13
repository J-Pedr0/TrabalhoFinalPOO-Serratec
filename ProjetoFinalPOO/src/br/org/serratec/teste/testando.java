package br.org.serratec.teste;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.org.serratec.model.Dependente;
import br.org.serratec.model.Funcionario;

public class testando {

	public static void main(String[] args) {
		

		Path caminho = Paths.get("/exemplos/empregados.txt");

		try {
			byte[] texto = Files.readAllBytes(caminho);
			String teste = new String(texto);
			Set<Funcionario> funcionarios = new HashSet<>();
			StringBuilder sb = new StringBuilder();
			
			String[] testando = teste.split("\n\n");
			
			for (String testando1 : testando) {
				System.out.println(testando1 + "AAAAAAAAAAAAAAAAAAA");
			}
			
			
			
			System.out.println(teste);
			
			
//			while (sc.hasNextLine()) {
//				String linha = sc.nextLine();
//				sb.append(sc.nextLine());
//				System.out.println(sb);
//					
//					
//			}
//			sc.close();
			
			
			
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
