package ro.cts.main;

import ro.cts.models.Client;
import ro.cts.models.Localuri;
import ro.cts.models.Observer;
import ro.cts.models.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("Leontin");
        Observer client2 = new Client("Ludovic");
        Observer client3 = new Client("Leopold");

        Localuri restaurant = new Restaurant("La Birlic");

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);

        restaurant.rezervaMasa();

        restaurant.stergeObserver(client2);

        restaurant.trimiteMesaj("Restaurantul este full");






    }
}
