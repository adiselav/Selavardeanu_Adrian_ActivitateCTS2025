package ro.cts.main;

import ro.cts.models.Facade;
import ro.cts.models.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Produs produs1 = new Produs(16,"Shaorma",true);
        Produs produs2 = new Produs(30,"Pizza",true);
        Produs produs3 = new Produs(15,"Mici",true);
        Produs produs4 = new Produs(22,"Papanasi",false);

        List<Produs> produse = new ArrayList<>();
        produse.add(produs1);
        produse.add(produs2);
        produse.add(produs3);
        produse.add(produs4);

        Facade facade = new Facade();
        for(Produs produs : produse){
            System.out.println(facade.statusProdus(produs));
        }



    }
}
