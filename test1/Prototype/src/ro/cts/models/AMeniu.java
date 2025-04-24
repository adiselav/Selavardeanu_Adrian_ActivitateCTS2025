package ro.cts.models;

public abstract class AMeniu {
    protected int nrProduse;
    protected String culoare;
    protected String nume;
    protected int nrPagini;
    protected float coperto;

   protected AMeniu() {
        this.nrProduse = 100;
        this.culoare = "rosu";
        this.nume = "Hanul lui Manuc";
        this.nrPagini = 15;
        this.coperto = 2.20f;
    }

    protected AMeniu(int nrProduse, String culoare, String nume, int nrPagini, float coperto) {
        this.nrProduse = nrProduse;
        this.culoare = culoare;
        this.nume = nume;
        this.nrPagini = nrPagini;
        this.coperto = coperto;
    }

    public abstract AMeniu clonare();
    public abstract void comanda();
}
