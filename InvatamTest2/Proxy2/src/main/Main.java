package main;

import models.Client;
import models.ClientProxy;
import models.IClient;

public class Main {
    public static void main(String[] args) {
        IClient client = new Client(50,"Leontin",50);
        IClient client2 = new Client(17, "Pilula", 100);
        IClient client3 = new Client(60,"Nea Vali", 10);

        client.cumparaTigari(50,25);
        client2.cumparaTigari(17,25);
        client3.cumparaTigari(60,25);

        IClient proxy = new ClientProxy(client);
        IClient proxy2 = new ClientProxy(client2);
        IClient proxy3 = new ClientProxy(client3);

        System.out.println();

        proxy.cumparaTigari(((Client)client).getVarsta(),25);
        proxy2.cumparaTigari(((Client)client2).getVarsta(),25);
        proxy3.cumparaTigari(((Client)client3).getVarsta(),25);



    }
}
