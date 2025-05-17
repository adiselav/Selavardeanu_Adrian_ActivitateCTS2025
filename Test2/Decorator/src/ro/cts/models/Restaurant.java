package ro.cts.models;

public class Restaurant implements Local{
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void serveste() {
        System.out.println("Bine ati venit la restaurantul " + this.nume);
    }

}
