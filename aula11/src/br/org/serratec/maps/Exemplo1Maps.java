package br.org.serratec.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo1Maps {

	public static void main(String[] args) {
		LinkedHashMap<String, String> estados = new LinkedHashMap<>();
//		TreeMap<String, String> estados = new TreeMap<>();
//		Map<String, String> estados = new HashMap<>();
		estados.put("AC", "ACRE");
		estados.put("RJ", "RIO DE JANEIRO");
		estados.put("MG", "Minas GERAIS");
		estados.put("SP", "SÃO PAULO");
		estados.put("SE", "SERGIPE");
		estados.put("SE", "SERGIPE");

		System.out.println("-----Retorna a chave do mapa--------");
		for (String string : estados.keySet()) {
			System.out.println(string);
		}

		System.out.println("-----Retorna os valores do mapa-----");
		for (String string : estados.values()) {
			System.out.println(string);
		}
		System.out.println("-----Retorna a chave e os valores do mapa-----");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			// System.out.println(mapa.getKey() + "-" + mapa.getValue());
			System.out.println(mapa);
		}
		
		
	}

}
