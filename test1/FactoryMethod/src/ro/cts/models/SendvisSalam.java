package ro.cts.models;

public class SendvisSalam extends FelMancare{
    private String tipSalam;
    private boolean salata;

    public SendvisSalam(float pret, int cantitate, String tipSalam, boolean salata) {
        super(pret, cantitate);
        this.tipSalam = tipSalam;
        this.salata = salata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendvisSalam{");
        sb.append("tipSalam='").append(tipSalam).append('\'');
        sb.append(", salata=").append(salata);
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
