package cts.selavardeanu.adrian.g1099.models;

public class Bichon extends AAnimal{

    private int nivelLatrat;
    private int nrPlimbari;

    public Bichon(String nume, int varsta, int nivelLatrat, int nrPlimbari) {
        super(nume, varsta);
        this.nivelLatrat = nivelLatrat;
        this.nrPlimbari = nrPlimbari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bichon{");
        sb.append("nivelLatrat=").append(nivelLatrat);
        sb.append(", nrPlimbari=").append(nrPlimbari);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
