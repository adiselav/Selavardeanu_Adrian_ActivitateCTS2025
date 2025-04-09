package ro.cts.restaurant;

import ro.cts.restaurant.models.IBuilder;
import ro.cts.restaurant.models.Rezervare;
import ro.cts.restaurant.models.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder("Ionescu Nicolae");
        Rezervare rezervare;
        Rezervare rezervare1;

        IBuilder rezervareBuilder1 = new RezervareBuilder("Tache Ionescu");

        rezervare = rezervareBuilder.buildRezervare();
        rezervare1 = rezervareBuilder1.setGenMuzica("rock").buildRezervare();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}
