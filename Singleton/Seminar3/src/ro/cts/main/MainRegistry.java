package ro.cts.main;

import ro.cts.registry.AgentieImobiliara;
import ro.cts.registry.Anunt;

//instanta unica per obiect => registry

public class MainRegistry {
    public static void main(String[] args) {
        AgentieImobiliara agentie = new AgentieImobiliara("Imobiliare.ro",120000);
        Anunt anunt = agentie.getAnunt("Piata Romana nr. 6","Popescu",3);
        Anunt anunt2 = agentie.getAnunt("Piata Universitatii nr. 10","Ionescu",3);
        Anunt anunt3 = agentie.getAnunt("Piata Romana nr. 6","Vasilescu",3);

        System.out.println(anunt3);
    }
}
