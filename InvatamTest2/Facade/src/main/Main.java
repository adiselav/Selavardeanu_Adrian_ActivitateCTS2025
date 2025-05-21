package main;

import modules.Facade;
import modules.Ghiseu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Ghiseu ghiseu1 = new Ghiseu(2,1,true);
        Ghiseu ghiseu2 = new Ghiseu(2,2, true);
        Ghiseu ghiseu3 = new Ghiseu(2,3,true);
        Ghiseu ghiseu4 = new Ghiseu(1,3,true);
        Ghiseu ghiseu5 = new Ghiseu(1,4,false);

        Facade facade = new Facade();

        List<Ghiseu> ghiseuList = new ArrayList<Ghiseu>();
        ghiseuList.add(ghiseu1);
        ghiseuList.add(ghiseu2);
        ghiseuList.add(ghiseu3);
        ghiseuList.add(ghiseu4);
        ghiseuList.add(ghiseu5);

        for (Ghiseu ghiseu : ghiseuList) {
            facade.verificare(ghiseu);
        }
    }
}
