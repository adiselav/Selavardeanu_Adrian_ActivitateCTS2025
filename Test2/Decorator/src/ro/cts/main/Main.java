package ro.cts.main;

import ro.cts.models.Catering;
import ro.cts.models.Local;
import ro.cts.models.Restaurant;
import ro.cts.models.StreetFood;

public class Main {
    public static void main(String[] args) {
        Local restaurant = new Restaurant("La Birlic");
        Local streetFood = new StreetFood(restaurant);
        Local catering = new Catering(streetFood);

        System.out.println();
        streetFood.serveste();

        System.out.println();
        catering.serveste();
    }
}
