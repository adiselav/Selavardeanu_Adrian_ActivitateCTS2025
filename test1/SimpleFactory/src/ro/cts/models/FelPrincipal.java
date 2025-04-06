package ro.cts.models;

public abstract class FelPrincipal {
    private int cantitate;
    private float pret;
    private String restaurant;
    private Boolean areGarnitura;

    public FelPrincipal(int cantitate, float pret, String restaurant, Boolean areGarnitura) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.restaurant = restaurant;
        this.areGarnitura = areGarnitura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelPrincipal{");
        sb.append("cantitate=").append(cantitate);
        sb.append(", pret=").append(pret);
        sb.append(", restaurant='").append(restaurant).append('\'');
        sb.append(", areGarnitura=").append(areGarnitura);
        sb.append('}');
        return sb.toString();
    }

    public abstract void serveste();
}
