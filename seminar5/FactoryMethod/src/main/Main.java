package main;

import fabrici.*;
import models.FelMancare;

import java.beans.FeatureDescriptor;

public class Main {
    public static void main(String[] args) {
        TipMancareFactory fabricaDeSupe = new SupaFactory(450);
        FelMancare supa1 = fabricaDeSupe.prepareFelMancare(Supe.SupaCiuperci,30,400);

        FelMancare supa2 = fabricaDeSupe.prepareFelMancare(Supe.SupaLegume, 20, 300);

        System.out.println(supa1.toString());
        System.out.println(supa2.toString());

        TipMancareFactory fabricaDeDeserturi = new DesertFactory("Nutella");
        FelMancare desert1 = fabricaDeDeserturi.prepareFelMancare(Desert.Papanasi,39,900);
        FelMancare desert2 = fabricaDeDeserturi.prepareFelMancare(Desert.Clatite,29,500);

        System.out.println(desert1.toString());
        System.out.println(desert2.toString());
    }
}
