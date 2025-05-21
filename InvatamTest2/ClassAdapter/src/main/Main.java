package main;

import models.*;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("Sammsung", "0740444555");
        IMicroSD cardMicroSD = new MicroSD(16,"ADATA","Samsung");
        telefon.afiseaza(cardMicroSD);

        Adapter adapterSD = new Adapter(128, "iPhone");
        telefon.afiseaza(adapterSD);
        adapterSD.acceseazaMicroSD();
    }
}
