package ro.cts.models;

public class Meniu extends AMeniu{

    public Meniu() {
    }

    public Meniu(int nrProduse, String culoare, String nume, int nrPagini, float coperto) {
        super(nrProduse, culoare, nume, nrPagini, coperto);
    }

    @Override
    public AMeniu clonare() {
        Meniu m = new Meniu();
        m.coperto = this.coperto;
        m.culoare = this.culoare;
        m.nrPagini = this.nrPagini;
        m.nume = this.nume;
        m.nrProduse = this.nrProduse;
        return m;

    }

    @Override
    public void comanda() {
        System.out.println("Adu un meniu garcon!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meniu{");
        sb.append("nrProduse=").append(nrProduse);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrPagini=").append(nrPagini);
        sb.append(", coperto=").append(coperto);
        sb.append('}');
        return sb.toString();
    }
}
