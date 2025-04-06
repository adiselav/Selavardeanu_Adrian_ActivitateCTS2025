package ro.cts.factories;

import ro.cts.models.FelPrincipal;
import ro.cts.models.Friptura;
import ro.cts.models.Peste;

public class Factory {
    private String nivel;
    private String tip;

    private static Factory instance = null;

    private Factory(String nivel, String tip) {
        this.nivel = nivel;
        this.tip = tip;
    }

    public synchronized  static Factory getInstance(String nivel, String tip) {
        if (instance == null) {
            instance = new Factory(nivel, tip);
        }
        return instance;
    }

    public FelPrincipal getProdus(Fel fel, int cantitate, float pret, String restaurant, Boolean areGarnitura){
        switch (fel){
            case FRIPTURA -> {return new Friptura(cantitate, pret, restaurant, areGarnitura, this.nivel, this.tip);}
            case PESTE -> {return new Peste(cantitate, pret, restaurant, areGarnitura, this.tip, this.nivel);}
            default -> {return null;}
        }
    }
}
