package ro.cts.models;

public class Peste extends FelPrincipal{
    private String nivel;
    private String tip;

    public Peste(int cantitate, float pret, String restaurant, Boolean areGarnitura, String nivel, String tip) {
        super(cantitate, pret, restaurant, areGarnitura);
        this.nivel = nivel;
        this.tip = tip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Peste{");
        sb.append("nivel='").append(nivel).append('\'');
        sb.append(", tip='").append(tip).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void serveste() {
        System.out.println("Mananc pestele proaspat.");
    }


}
