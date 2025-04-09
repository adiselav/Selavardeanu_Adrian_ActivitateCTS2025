package cts.selavardeanu.adrian.g1099.models;

import java.util.Arrays;

public class RezervareBuilder implements IBuilder{

    protected String nume;
    protected int nrPaturi;
    protected float pret;
    protected int nrPersoane;
    protected String[] persoane;

    //optional pt builder
    protected boolean isFumator;
    protected boolean hasBalcon;
    protected int nrBai;

    public RezervareBuilder() {
        this.nume = "Leontin";
        this.nrPaturi = 2;
        this.pret = 250;
        this.nrPersoane = 2;
        this.persoane = new String[]{"Leontin","Leontina"};
        this.isFumator = true;
        this.hasBalcon = false;
        this.nrBai = 1;
    }


    @Override
    public Rezervare buildRezervare(String nume, int nrPaturi, float pret) {
        return new Rezervare(nume,nrPaturi,pret,this.nrPersoane,this.persoane,this.isFumator,this.hasBalcon,this.nrBai);
    }

    @Override
    public IBuilder setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
        return this;
    }

    @Override
    public IBuilder setPersoane(String[] persoane) {
        this.persoane = Arrays.copyOf(persoane, persoane.length);
        return this;
    }

    @Override
    public IBuilder setFumator(boolean isFumator) {
        this.isFumator = isFumator;
        return this;
    }

    @Override
    public IBuilder setHasBalcon(boolean hasBalcon) {
        this.hasBalcon = hasBalcon;
        return this;
    }

    @Override
    public IBuilder setNrBai(int nrBai) {
        this.nrBai = nrBai;
        return this;
    }
}
