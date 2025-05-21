package main;

import modules.IRezervare;
import modules.Rezervare;
import modules.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");

        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);

        proxy.rezervare("Leontin",2);
        proxy.rezervare("Leontin",4);
        proxy.rezervare("Leontin",6);

        System.out.println("---------------------------------------------");

    }
}
