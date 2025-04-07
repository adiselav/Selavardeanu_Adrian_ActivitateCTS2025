package ro.cts.models;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder1 = new RezervareBuilder("Leontin Leontinescu");
        Rezervare rezervare1;
        Rezervare rezervare2;

        IBuilder rezervareBuilder2 = new RezervareBuilder("Liviu Onofrei");

        rezervare1 = rezervareBuilder1.setOra("20:00").getRezervare();
        rezervare2 = rezervareBuilder2.setNrPersoane(4).setFumator(true).getRezervare();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}
