package ro.cts.models;

public class Restaurant extends Localuri{
    public Restaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void rezervaMasa() {
        trimiteMesaj("Rezerva masa la restaurantul " + this.getDenumire());

    }
}
