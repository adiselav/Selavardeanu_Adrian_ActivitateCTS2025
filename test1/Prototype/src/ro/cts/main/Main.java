package ro.cts.main;

import ro.cts.models.AMeniu;
import ro.cts.models.Meniu;

public class Main {
    public static void main(String[] args) {
        AMeniu meniu1 = new Meniu(200,"albastra","Casa Jienilor",12, 2.50f);
        AMeniu meniu2 = meniu1.clonare();

        System.out.println(meniu2.toString());

    }
}
