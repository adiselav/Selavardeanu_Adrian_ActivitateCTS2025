package modules;

public class Main {
    public static void main(String[] args) {
        ManagerRestaurant manager = ManagerRestaurant.getInstance("Leontin",35,10000,10);
        System.out.println(manager.toString());
        manager = null;
        manager =  ManagerRestaurant.getInstance("Adi",0,15000,10);
        System.out.println(manager.toString());

    }
}
