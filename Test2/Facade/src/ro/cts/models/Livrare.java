package ro.cts.models;

public class Livrare {
    public boolean esteLivrat(Produs produs){
        return produs.getPret()%4==0;
    }
}
