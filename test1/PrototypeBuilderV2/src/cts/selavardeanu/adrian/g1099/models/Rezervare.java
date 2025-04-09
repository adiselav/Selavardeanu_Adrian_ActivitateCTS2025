package cts.selavardeanu.adrian.g1099.models;

import java.util.Arrays;

public class Rezervare extends ARezervare{

    private Rezervare() {
        super();
    }

    public Rezervare(String nume, int nrPaturi, float pret, int nrPersoane, String[] persoane, boolean isFumator, boolean hasBalcon, int nrBai) {
        super(nume, nrPaturi, pret, nrPersoane, persoane, isFumator, hasBalcon, nrBai);
    }

    @Override
    public ARezervare clonare() {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.nrPaturi = this.nrPaturi;
        rezervare.pret = this.pret;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.persoane = new String[this.persoane.length];
        for (int i = 0; i < this.persoane.length; i++) {
            rezervare.persoane[i] = this.persoane[i];
        }
        rezervare.isFumator = this.isFumator;
        rezervare.hasBalcon = this.hasBalcon;
        rezervare.nrBai = this.nrBai;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPaturi=").append(nrPaturi);
        sb.append(", pret=").append(pret);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", persoane=").append(Arrays.toString(persoane));
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasBalcon=").append(hasBalcon);
        sb.append(", nrBai=").append(nrBai);
        sb.append('}');
        return sb.toString();
    }



}
