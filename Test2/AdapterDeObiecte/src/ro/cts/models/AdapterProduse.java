package ro.cts.models;

public class AdapterProduse extends ProdusDelivery{
    private ProdusRestaurant produsOriginal;

    public AdapterProduse(String nume, float pret, int km, ProdusRestaurant produsOriginal) {
        super(nume, pret, km);
        this.produsOriginal = produsOriginal;
    }

    public AdapterProduse(ProdusRestaurant produsOriginal){
        super(produsOriginal.getNume(),produsOriginal.getPret(),10);
        this.produsOriginal=produsOriginal;
    }

    public void livrareProdus(){
        produsOriginal.aduNotaDePlata();
    }


}
