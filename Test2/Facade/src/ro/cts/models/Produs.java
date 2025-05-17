package ro.cts.models;

public class Produs {
    private float pret;
    private String nume;
    private Boolean estePreparat;

    public Produs(float pret, String nume, Boolean estePreparat) {
        this.pret = pret;
        this.nume = nume;
        this.estePreparat = estePreparat;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public Boolean getEstePreparat() {
        return estePreparat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", estePreparat=").append(estePreparat);
        sb.append('}');
        return sb.toString();
    }
}
