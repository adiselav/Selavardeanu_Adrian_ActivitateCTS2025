package ro.cts.models;

public class Tiramisu extends FelMancare{
    private Boolean extraCacao;
    private int nrFelii;

    public Tiramisu(float pret, int cantitate, Boolean extraCacao, int nrFelii) {
        super(pret, cantitate);
        this.extraCacao = extraCacao;
        this.nrFelii = nrFelii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tiramisu{");
        sb.append("extraCacao=").append(extraCacao);
        sb.append(", nrFelii=").append(nrFelii);
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}


