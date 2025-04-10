package cts.selavardeanu.adrian.g1099.models;

import java.util.Arrays;

public abstract class ARezervare {
    protected String nume;
    protected int nrPaturi;
    protected float pret;

    //optional pt builder
    protected int nrPersoane;
    protected String[] persoane;
    protected boolean isFumator;
    protected boolean hasBalcon;
    protected int nrBai;

    protected ARezervare() {
        this.nume = "Leontin";
        this.nrPaturi = 1;
        this.pret = 125.99f;
        this.nrPersoane = 0;
        this.persoane = null;
        this.isFumator = true;
        this.hasBalcon = false;
        this.nrBai = 0;
    }

    protected ARezervare(String nume, int nrPaturi, float pret, int nrPersoane, String[] persoane, boolean isFumator, boolean hasBalcon, int nrBai) {
        this.nume = nume;
        this.nrPaturi = (nrPaturi > 0) ? nrPaturi : 1;
        this.pret = pret;
        this.nrPersoane = nrPersoane;
        this.persoane = Arrays.copyOf(persoane, persoane.length);
        this.isFumator = isFumator;
        this.hasBalcon = hasBalcon;
        this.nrBai = nrBai;
    }

    public abstract ARezervare clonare();

}
