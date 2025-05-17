package ro.cts.models;

public class Facade {
    public String statusProdus(Produs produs) {
        Livrare livrator = new Livrare();
        Preluare preluare = new Preluare();
        if (produs.getEstePreparat()) {
            if (preluare.esteRidicat(produs)){
                if (livrator.esteLivrat(produs)){
                    return produs.toString();
                }
                else {
                    return "Se livreaza";
                }
            }
            else {
                return "Se ridica";
            }
        }
        else {
            return "Se prepara";
        }
    }
}