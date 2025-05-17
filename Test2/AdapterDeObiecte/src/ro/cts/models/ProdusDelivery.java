package ro.cts.models;

public class ProdusDelivery {
    private String nume;
    private float pret;
    private int km;

    public ProdusDelivery(String nume, float pret, int km) {
        this.nume = nume;
        this.pret = pret;
        this.km = km;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public int getKm() {
        return km;
    }

    public void livrareProdus(){
        System.out.println("Se livreaza " + this.nume);
        if (this.km<3){
            System.out.println("cu livrare gratuita");
        }
        else System.out.println("si livrarea costa " + this.pret/4);
    }


}
