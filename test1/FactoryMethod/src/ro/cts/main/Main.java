package ro.cts.main;

import ro.cts.factories.*;
import ro.cts.models.FelMancare;

public class Main {
    public static void main(String[] args) {
        IFactory fabricaDeserturi = DesertFactory.getIntanta(true, "afine", false, 2);
        IFactory fabricaSendvisuri = new SendvisFactory("Sibiu",true,1,"neagra");
        FelMancare papanasi = fabricaDeserturi.getFelMancare(Desert.Papanasi,25,500);
        FelMancare tiramisu = fabricaDeserturi.getFelMancare(Desert.Tiramisu,30,400);
        FelMancare sendvisSalam = fabricaSendvisuri.getFelMancare(Sendvis.SendvisSalam,15,250);
        FelMancare sendvisSunca = fabricaSendvisuri.getFelMancare(Sendvis.SenvisSunca,12,200);
        System.out.println(papanasi.toString());
        System.out.println(tiramisu.toString());
        System.out.println(sendvisSalam.toString());
        System.out.println(sendvisSunca.toString());

        IFactory fabricaDeserturi2 = DesertFactory.getIntanta(true, "visine", true, 1);
        FelMancare papanasi2 = fabricaDeserturi2.getFelMancare(Desert.Papanasi,35,550);
        System.out.println(papanasi2.toString());
    }
}
