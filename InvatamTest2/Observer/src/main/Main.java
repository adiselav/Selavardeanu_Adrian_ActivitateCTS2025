package main;

import models.Destinatar;
import models.Grup;
import models.GrupWhatsApp;
import models.MembruGrup;

public class Main {
    public static void main(String[] args) {
        Destinatar calator1 = new MembruGrup("Leontin","0740444555",50);
        Destinatar calator2 = new MembruGrup("Ludovic","0740555777",19);
        Destinatar calator3 = new MembruGrup("Liviu","0740777888",14);

        GrupWhatsApp grup = new GrupWhatsApp("Grupa 1099");
        grup.adaugaObserver(calator1);
        grup.adaugaObserver(calator2);
        grup.adaugaObserver(calator3);
        grup.intraNotificare();
        grup.stergeObserver(calator2);
    }
}
