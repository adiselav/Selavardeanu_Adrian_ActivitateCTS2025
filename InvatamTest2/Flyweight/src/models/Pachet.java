package models;

public class Pachet implements IPachet{

    private int cod;
    private String nume;
    private int nrPersoane;

    public Pachet(int cod, String nume, int nrPersoane) {
        this.cod = cod;
        this.nume = nume;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void rezerva(Optionale optionale) {
        System.out.println("Rezervarea pe numele " + this.nume + " avand codul " + this.cod + " are " + this.nrPersoane + " persoane ");
        System.out.println(optionale.toString()); ;
    }
}
