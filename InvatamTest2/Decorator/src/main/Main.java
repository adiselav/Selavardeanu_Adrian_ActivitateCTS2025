package main;

import modules.Felicitare;
import modules.FelicitareDeCraciun;
import modules.IFelicitare;

public class Main {
    public static void main(String[] args) {
        IFelicitare felicitare = new Felicitare("Leontin",2.00f);
        IFelicitare felicitareDecorata = new FelicitareDeCraciun(felicitare);

        System.out.println();
        felicitare.urare();

        System.out.println();
        felicitareDecorata.urare();


    }
}
