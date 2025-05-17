package ro.cts.models;

public class Preluare {
    public boolean esteRidicat(Produs produs){
        return produs.getPret()%2==0;
    }

}
