package ro.cts.models;

public class Produs implements IProdus {

    private String nume;
    private float pret;

    public Produs(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void detaliiProdus(Extra extra) {
        System.out.println("Produs " + this.nume + " - Pret: " + this.pret);
        System.out.println(extra.toString());
    }
}
