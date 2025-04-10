package cts.selavardeanu.adrian.g1099.factory.models;

public class Asistenta extends APersonalSpital{
    private int atentie;

    public Asistenta(String nume, int salariu, int atentie) {
        super(nume, salariu);
        this.atentie = atentie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistenta{");
        sb.append("atentie=").append(atentie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void atentie() {
        System.out.println("Asistenta atentie: "+ atentie);
    }

}
