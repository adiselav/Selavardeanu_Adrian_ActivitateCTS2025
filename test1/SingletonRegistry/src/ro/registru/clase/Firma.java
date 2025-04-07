package ro.registru.clase;

public class Firma {
    private String nume;
    private int CifraAfaceri;
    private String adresa;
    private int nrAngajati;

    protected Firma(String nume, int cifraAfaceri, String adresa, int nrAngajati) {
        this.nume = nume;
        CifraAfaceri = cifraAfaceri;
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Firma{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", CifraAfaceri=").append(CifraAfaceri);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
