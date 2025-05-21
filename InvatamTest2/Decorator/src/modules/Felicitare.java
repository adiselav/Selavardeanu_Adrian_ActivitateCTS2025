package modules;

public class Felicitare implements IFelicitare{
    private String destinar;
    private float pret;

    public Felicitare(String destinar, float pret) {
        this.destinar = destinar;
        this.pret = pret;
    }

    public String getDestinar() {
        return destinar;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public void urare() {
        System.out.println("Felicitare de " + this.pret + " lei pentru " + this.destinar);

    }
}
