package ro.cts.models;

public class Produs implements Structura
{
    private String nume;
    private float pret;

    public Produs(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");

    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");

    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + "Produsul " + this.nume + " - " + this.pret + " lei");

    }
}
