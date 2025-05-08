package ro.cts.main;

import ro.cts.models.Nota;
import ro.cts.models.NotaDePlata;
import ro.cts.models.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();
        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();
    }
}