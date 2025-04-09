package cts.selavardeanu.adrian.g1099.models;

public interface IBuilder {
    Rezervare buildRezervare(String nume, int nrPaturi, float pret);
    IBuilder setNrPersoane(int nrPersoane);
    IBuilder setPersoane(String[] persoane);
    IBuilder setFumator(boolean fumator);
    IBuilder setHasBalcon(boolean hasBalcon);
    IBuilder setNrBai(int nrBai);
}

