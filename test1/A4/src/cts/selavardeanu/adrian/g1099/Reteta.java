package cts.selavardeanu.adrian.g1099;

public class Reteta extends AReteta{

    protected Reteta() {
        super();
    }

    public Reteta(String numePacienti, String numeDoctor, String numeMedicament, boolean compensate, int datiFolosire) {
        super(numePacienti, numeDoctor, numeMedicament, compensate, datiFolosire);
    }

    @Override
    public AReteta clonare() {
        AReteta r = new Reteta();
        r.numePacienti = this.numePacienti;
        r.numeDoctor = this.numeDoctor;
        r.numeMedicament = this.numeMedicament;
        r.compensate = this.compensate;
        r.datiFolosire = this.datiFolosire;
        return r;
    }

    @Override
    public void citire() {
        System.out.println("Citeste reteta");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numePacienti='").append(numePacienti).append('\'');
        sb.append(", numeDoctor='").append(numeDoctor).append('\'');
        sb.append(", numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compensate=").append(compensate);
        sb.append(", datiFolosire=").append(datiFolosire);
        sb.append('}');
        return sb.toString();
    }
}


