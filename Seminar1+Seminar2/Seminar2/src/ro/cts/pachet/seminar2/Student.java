package ro.cts.pachet.seminar2;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + an_studii ;
	}
	
}
