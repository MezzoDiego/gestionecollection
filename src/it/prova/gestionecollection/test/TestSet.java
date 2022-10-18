package it.prova.gestionecollection.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//le set a differenza delle liste, contengono solo valori unici e non ordinati

public class TestSet {

	public static void main(String[] args) {

		// verifica che in un set non ci possono essere valori uguali
		Set<String> set = new HashSet<>();

		boolean added = set.add("ciao");
		boolean added2 = set.add("ciao");

		System.out.println(added);
		System.out.println(added2);
		System.out.println("---------------------------------------------");

		// verifica del metodo setof al posto di add
		Set<String> set2 = Set.of("hello", "world");

		for (String element : set2)
			System.out.println(element);
		System.out.println("---------------------------------------------");
		// verifica dell'utilizzo di TreeSet anziche' HashSet(mette in ordine cio' che
		// e'presente dentro il set)
		Set<String> set3 = new TreeSet<>();
		set3.add("ciao");
		set3.add("1");
		set3.add("2");
		set3.add("yeah");

		for (String element : set3)
			System.out.println(element);
		System.out.println("---------------------------------------------");
		// verifica rimozione di un elemento dalla set, per eliminarli tutti usare
		// metodo clear()

		boolean removed = set3.remove("yeah");

		System.out.println(removed);

		for (String element : set3)
			System.out.println(element);
		System.out.println("---------------------------------------------");
		// verifica del funzionamento del metodo addAll() e removeAll()

		set3.addAll(Set.of("1", "3", "buddy"));

		for (String element : set3)
			System.out.println(element);

		set3.removeAll(Set.of("1", "2", "ciao"));

		for (String element : set3)
			System.out.println(element);
		System.out.println("---------------------------------------------");
		// verifica del funzionamento del metodo contains()

		boolean contains1 = set3.contains("buddy");

		System.out.println(contains1);

	}

}
