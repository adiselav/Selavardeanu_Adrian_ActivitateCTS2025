package ro.cts.main;

import ro.cts.models.AdapterProduse;
import ro.cts.models.IProdusDelivery;
import ro.cts.models.Livrator;
import ro.cts.models.ProdusDelivery;

public class Main {
    public static void main(String[] args) {
        Livrator livrator = new Livrator("Amir",true);
        IProdusDelivery produs1 = new ProdusDelivery("Shaorma",19.90f,5);
        livrator.Glovo(produs1);

        System.out.println();

        AdapterProduse adaptor = new AdapterProduse("Burger", 55.00f);
        adaptor.livrareProdus();
        adaptor.aduNotaDePlata();
        adaptor.comandaProdus();


    }
}
