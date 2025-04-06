package modules;

public class ManagerRestaurant {
    private String nume;
    private int experienta;
    private float salariu;
    private int angajati;
    private static ManagerRestaurant managerRestaurant = null;

    private ManagerRestaurant(String nume, int experienta, float salariu, int angajati) {
        this.nume = nume;
        this.experienta = experienta;
        this.salariu = salariu;
        this.angajati = angajati;
    }

    public synchronized static ManagerRestaurant getInstance(String nume, int experienta, float salariu, int angajati){
        if (managerRestaurant == null) {
            managerRestaurant = new ManagerRestaurant(nume,  experienta, salariu, angajati);
        }
        return managerRestaurant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerRestaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", experienta=").append(experienta);
        sb.append(", salariu=").append(salariu);
        sb.append(", angajati=").append(angajati);
        sb.append('}');
        return sb.toString();
    }


}
