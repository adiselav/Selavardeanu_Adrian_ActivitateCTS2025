package ro.cts.models;

public class AdapterProduse extends ProdusRestaurant implements IProdusDelivery{

    public AdapterProduse(String nume, Float pret) {
        super(nume, pret);
    }

    @Override
    public void livrareProdus() {
        super.aduNotaDePlata();

    }
}
