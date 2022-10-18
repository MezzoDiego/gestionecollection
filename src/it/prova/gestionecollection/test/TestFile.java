package it.prova.gestionecollection.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {

		File file = new File("prova.txt");

		if (file.exists()) {
			System.out.println("il file esiste");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			// file.delete();
		} else {
			System.out.println("il file non esiste");
		}

		// --------------------------------FileWriter---------------
		try {
			FileWriter writer = new FileWriter("prova.txt");
			writer.write("ciao sono Diego");
			writer.append("\n prova file"); // aggiunge
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// --------------------------------FileReader---------------

		try {
			FileReader reader = new FileReader("prova.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
