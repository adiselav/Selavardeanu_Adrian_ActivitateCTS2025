package ro.cts.main;

import ro.cts.models.AdapterProduse;
import ro.cts.models.ProdusDelivery;
import ro.cts.models.ProdusRestaurant;

public class Main {
    public static void produseLivrare(ProdusDelivery produsDelivery){
        System.out.println("Livram produsul: ");
        produsDelivery.livrareProdus();
    }
    public static void main(String[] args) {
        ProdusDelivery produs1 = new ProdusDelivery("Cartofi prajiti",10.00f,2);
        ProdusDelivery produs2 = new ProdusDelivery("Pizza",50.00f,11);

        produseLivrare(produs1);
        produseLivrare(produs2);

        ProdusRestaurant produs3 = new ProdusRestaurant("Friptura", 40.00f);
        ProdusRestaurant produs4 = new ProdusRestaurant("Papanasi",25.00f);

        produseLivrare(new AdapterProduse(produs3));
        produseLivrare(new AdapterProduse(produs4));

    }
}
