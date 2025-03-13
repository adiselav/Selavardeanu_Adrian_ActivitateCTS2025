package ro.cts.pachet.seminar2;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

    public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public void setPunctaj(int punctaj) {

		this.punctaj = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setNrProiecte(int nrProiecte, String[] denumireProiect) {

		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}

}
