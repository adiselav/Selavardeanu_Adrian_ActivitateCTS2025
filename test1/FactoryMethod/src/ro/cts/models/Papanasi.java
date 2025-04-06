package ro.cts.models;

public class Papanasi extends FelMancare{
    private Boolean gem;
    private String aroma;

    public Papanasi(float pret, int cantitate, Boolean gem, String aroma) {
        super(pret, cantitate);
        this.gem = gem;
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanasi{");
        sb.append("gem=").append(gem);
        sb.append(", aroma='").append(aroma).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
