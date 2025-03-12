package ro.cts.pachet.seminar2;

import seminar2.readers.AngajatReader;
import seminar2.readers.BaseReader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {

	private static final Logger LOGGER = Logger.getLogger(Program.class.getName());

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader = new AngajatReader("angajati.txt");
		try {
			listaAplicanti = baseReader.readAplicanti();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, "Fișierul nu a fost găsit: angajati.txt", e);
		}
	}
}
