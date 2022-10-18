package it.prova.gestionecollection.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		// key e valore di tipo String
		Map<String, String> stringMap = new HashMap<>();
		// key di tipo String e valore di tipo Double
		Map<String, Double> doubleMap = new HashMap<>();
		// key di tipo String e valore di tipo List<Integer>
		Map<String, List<Integer>> listMap = new HashMap<>();

		// esecuzione test funzionamento del metodo put() e get()

		// -----------------stringMap----------------
		stringMap.put("pappagallo", "unico animale parlante");
		System.out.println(stringMap.get("pappagallo"));
		// -----------------doubleMap----------------
		doubleMap.put("piGreco", 3.14159);
		System.out.println(doubleMap.get("piGreco"));
		// -----------------listeMap----------------
		List<Integer> listaInteger = new ArrayList<>();
		listaInteger.add(25);
		listaInteger.add(35);
		listaInteger.add(45);

		listMap.put("lista di Integer", listaInteger);
		listaInteger = listMap.get("lista di Integer");

		for (Integer element : listaInteger)
			System.out.println(element);
		// -----------------------------------------------------------

		// verifica funzionamento metodo keySet()
		HashMap<Integer, String> classifica = new HashMap<>();
		classifica.put(1, "Juventus");
		classifica.put(2, "Napoli");
		classifica.put(3, "Roma");
		classifica.put(4, "Inter");
		for (Integer key : classifica.keySet()) {
			System.out.println(classifica.get(key));
		}

	}

}
