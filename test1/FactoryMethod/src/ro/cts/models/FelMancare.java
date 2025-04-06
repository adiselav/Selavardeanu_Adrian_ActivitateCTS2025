package ro.cts.models;

public abstract class FelMancare {
    protected float pret;
    protected int cantitate;

    public FelMancare(float pret, int cantitate) {
        this.pret = pret;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelMancare{");
        sb.append("pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
