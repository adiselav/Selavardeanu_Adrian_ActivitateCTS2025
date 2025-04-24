package ro.registru.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistrulComertului {
    private String program;
    private float buget;
    private Map<String, Firma> firme = new HashMap<>();

    public RegistrulComertului(String program, float buget) {
        this.program = program;
        this.buget = buget;
    }
    public Firma getFirma(String nume, int cifraAfaceri, String adresa, int nrAngajati){
        if (!firme.containsKey(nume)) {
            Firma firma = new Firma(nume, cifraAfaceri,adresa,nrAngajati);
            firme.put(nume, firma);
        }
        return firme.get(nume);
    }

}

