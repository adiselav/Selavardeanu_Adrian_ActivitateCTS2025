package main;

import models.*;

public class Main {
    public static void main(String[] args) {
        IPlata voucher = new Voucher(10,40);
        IPlata cash =  new Cash(100);

        Client client1 = new Client("Leontin");
        client1.platesteMasa(80);

        client1.setMetodaPlata(voucher);
        client1.platesteMasa(80);

        client1.setMetodaPlata(cash);
        client1.platesteMasa(80);
    }




}
