package models;

public class Telefon {
    private String marca;
    private String numar;

    public Telefon(String marca, String numar) {
        this.marca = marca;
        this.numar = numar;
    }

    public void afiseaza(IMicroSD sd){
        System.out.println("Telefonul " + this.marca + " cu numarul de telefon " + this.numar);
        sd.acceseazaMicroSD();
    }
}
