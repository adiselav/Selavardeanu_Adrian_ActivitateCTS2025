package ro.cts.models;

import java.util.Arrays;

public class CET {
    private String denumireCentrala;
    private int nrAngajati;
    private float temperaturaAgentTermic;
    private int nrCartiereDeservite;
    private String[] CartiereDeservite;
    private static CET instanta = new CET("CET Grozavesti", 100, 69.98f,5, new String[]{"Militari", "Drumul Taberei", "Crangasi", "Cotroceni", "Rahova"});

    private CET(String denumireCentrala, int nrAngajati, float temperaturaAgentTermic, int nrCartiereDeservite, String[] cartiereDeservite) {
        this.denumireCentrala = denumireCentrala;
        this.nrAngajati = nrAngajati;
        this.temperaturaAgentTermic = temperaturaAgentTermic;
        this.nrCartiereDeservite = nrCartiereDeservite;
        CartiereDeservite = cartiereDeservite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CET{");
        sb.append("denumireCentrala='").append(denumireCentrala).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", temperaturaAgentTermic=").append(temperaturaAgentTermic);
        sb.append(", nrCartiereDeservite=").append(nrCartiereDeservite);
        sb.append(", CartiereDeservite=").append(Arrays.toString(CartiereDeservite));
        sb.append('}');
        return sb.toString();
    }

    public static CET getInstanta(){
        return instanta;
    }

    public void setDenumireCentrala(String denumireCentrala) {
        this.denumireCentrala = denumireCentrala;
    }
}