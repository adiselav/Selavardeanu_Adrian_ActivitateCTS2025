package cts.selavardeanu.adrian.g1099;

public abstract class AReteta {
    protected String numePacienti;
    protected String numeDoctor;
    protected String numeMedicament;
    protected boolean compensate;
    protected int datiFolosire;

    protected AReteta(){
        this.numePacienti = "Leon";
        this.numeDoctor = "Leontin";
        this.numeMedicament = "Claritin";
        this.compensate = true;
        this.datiFolosire = 1;
    }

    protected AReteta(String numePacienti, String numeDoctor, String numeMedicament, boolean compensate, int datiFolosire) {
        this.numePacienti = numePacienti;
        this.numeDoctor = numeDoctor;
        this.numeMedicament = numeMedicament;
        this.compensate = compensate;
        this.datiFolosire = datiFolosire;
    }

    public abstract AReteta clonare();
    public abstract void citire();
}
