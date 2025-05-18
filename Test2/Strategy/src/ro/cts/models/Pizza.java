package ro.cts.models;

public class Pizza {
    private String denumire;
    private float pret;
    private int dimensiune;
    private IPizza tipBlat;

    public Pizza(String denumire, float pret, int dimensiune) {
        this.denumire = denumire;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.tipBlat = new Subtire("subtire");
    }

    public Pizza(String denumire, float pret, int dimensiune, IPizza tipBlat) {
        this.denumire = denumire;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.tipBlat = tipBlat;
    }

    public void setTipBlat(IPizza tipBlat) {
        this.tipBlat = tipBlat;
    }

    public void gatestePizza(String blatAles) {
        tipBlat.blat(blatAles);
    }

}
