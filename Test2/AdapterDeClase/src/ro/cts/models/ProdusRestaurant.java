package ro.cts.models;

public class ProdusRestaurant {

    private String nume;
    private Float pret;

    public ProdusRestaurant(String nume, Float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public Float getPret() {
        return pret;
    }

    public void comandaProdus(){
        System.out.println("Ati comandat " + this.nume);
    }

    public void aduNotaDePlata(){
        comandaProdus();
        System.out.println("Aveti de platit " + this.pret);
    }
}