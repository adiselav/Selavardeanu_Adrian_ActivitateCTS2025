package ro.cts.models;

public class Extra {
    private boolean faraCEapa;
    private String tipSos;
    private float extraGramaj;

    public Extra(boolean faraCEapa, String tipSos, float extraGramaj) {
        this.faraCEapa = faraCEapa;
        this.tipSos = tipSos;
        this.extraGramaj = extraGramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Extra{");
        sb.append("faraCEapa=").append(faraCEapa);
        sb.append(", tipSos='").append(tipSos).append('\'');
        sb.append(", extraGramaj=").append(extraGramaj);
        sb.append('}');
        return sb.toString();
    }
}
