package models;

public class Optionale {
    private boolean mese;
    private int nrExcursii;

    public Optionale(boolean mese, int nrExcursii) {
        this.mese = mese;
        this.nrExcursii = nrExcursii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optionale{");
        sb.append("mese=").append(mese);
        sb.append(", nrExcursii=").append(nrExcursii);
        sb.append('}');
        return sb.toString();
    }
}
