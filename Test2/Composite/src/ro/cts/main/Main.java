package ro.cts.main;

import ro.cts.models.Categorie;
import ro.cts.models.Produs;
import ro.cts.models.Structura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println();

            Structura categorie1 = new Categorie("Fel Principal");
            Structura categorie2 = new Categorie("Aperitiv");
            Structura categorie3 = new Categorie("Desert");
            Structura categorie4= new Categorie("Bautura");

            Structura produs1 = new Produs("Papanasi", 35);
            Structura produs2 = new Produs("Clatite", 15);
            Structura produs3 = new Produs("Tiramisu", 50);
            Structura produs4 = new Produs("Vin", 30);
            Structura produs5 = new Produs("Limonada", 25);
            Structura produs6 = new Produs("Pizza", 50);
            Structura produs7 = new Produs("Paste", 60);
            Structura produs8 = new Produs("Bere", 10);
            Structura produs9 = new Produs("Paine", 2);

            categorie3.adaugaNod(produs1);
            categorie3.adaugaNod(produs2);
            categorie3.adaugaNod(produs3);

            categorie4.adaugaNod(produs4);
            categorie4.adaugaNod(produs5);
            categorie4.adaugaNod(produs8);

            categorie1.adaugaNod(produs6);
            categorie1.adaugaNod(produs7);

            categorie2.adaugaNod(categorie3);

            List<Structura> Meniu = new ArrayList<Structura>();
            Meniu.add(categorie1);
            Meniu.add(categorie2);
            Meniu.add(categorie4);
            Meniu.add(produs9);
            for (Structura structura : Meniu) {
                structura.descriereStructura("");
            }

            System.out.println("\n\n-------------------------------\n\n");
            categorie1.stergeNod(produs7);
            categorie3.adaugaNod(produs7);
            for (Structura structura : Meniu) {
                structura.descriereStructura("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
