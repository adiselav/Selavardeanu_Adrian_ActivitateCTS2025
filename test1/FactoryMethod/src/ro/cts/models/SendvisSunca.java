package ro.cts.models;

public class SendvisSunca extends FelMancare{
    private int feliiSunca;
    private String tipPaine;

    public SendvisSunca(float pret, int cantitate, int feliiSunca, String tipPaine) {
        super(pret, cantitate);
        this.feliiSunca = feliiSunca;
        this.tipPaine = tipPaine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendvisSunca{");
        sb.append("feliiSunca=").append(feliiSunca);
        sb.append(", tipPaine='").append(tipPaine).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
