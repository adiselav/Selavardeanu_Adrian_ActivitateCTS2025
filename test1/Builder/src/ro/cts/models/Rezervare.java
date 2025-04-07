package ro.cts.models;

public class Rezervare {
    private String nume;
    private int nrPersoane;
    private String ora;
    private String zi;
    private float pretMinim;
    private Boolean isFumator;

    protected Rezervare(String nume, int nrPersoane, String ora, String zi, float pretMinim, Boolean isFumator) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
        this.zi = zi;
        this.pretMinim = pretMinim;
        this.isFumator = isFumator;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    protected void setOra(String ora) {
        this.ora = ora;
    }

    protected void setZi(String zi) {
        this.zi = zi;
    }

    protected void setPretMinim(float pretMinim) {
        this.pretMinim = pretMinim;
    }

    protected void setFumator(Boolean fumator) {
        isFumator = fumator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", zi='").append(zi).append('\'');
        sb.append(", pretMinim=").append(pretMinim);
        sb.append(", isFumator=").append(isFumator);
        sb.append('}');
        return sb.toString();
    }
}
