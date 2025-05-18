package ro.cts.main;

import ro.cts.models.*;

public class Main {
    public static void main(String[] args) {
        IPizza subtire = new Subtire("subtire");
        IPizza blatPrezidentiabil = new Prezidentiabil(true);
        IPizza blatItalian = new Italian(50);

        Pizza pizza = new Pizza("Capriciosa", 60.00f, 50);
        pizza.gatestePizza("subtire");
        pizza.setTipBlat(blatPrezidentiabil);
        pizza.gatestePizza("subtire");
        pizza.setTipBlat(blatItalian);
        pizza.gatestePizza("subtire");

    }
}
