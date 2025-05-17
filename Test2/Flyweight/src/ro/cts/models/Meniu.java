package ro.cts.models;

import java.util.HashMap;

public class Meniu {

    private HashMap<String, IProdus> meniu;

    public Meniu() {
        this.meniu = new HashMap<>();
    }

    public IProdus getProdus(String nume, float pret) {
        if (!this.meniu.containsKey(nume)) {
            this.meniu.put(nume, new Produs(nume, pret));
        }
        return this.meniu.get(nume);
    }

    public IProdus getProdus(String nume) throws Exception {
        if (this.meniu.containsKey(nume)) {
            return this.meniu.get(nume);
        } else {
            throw new Exception("Produsul nu exista!");
        }
    }
}
