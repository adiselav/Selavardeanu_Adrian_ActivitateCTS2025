package ro.cts.main;

import ro.cts.factories.Factory;
import ro.cts.factories.Fel;
import ro.cts.models.FelPrincipal;

public class Main {
    public static void main(String[] args) {
        Factory bucatarie = Factory.getInstance("well done","carne rosie");
        FelPrincipal friptura = bucatarie.getProdus(Fel.FRIPTURA,450,49.99f,"Caru cu Bere",true);
        FelPrincipal peste = bucatarie.getProdus(Fel.PESTE,250,45.89f,"Caru cu Bere",true);

        System.out.println(friptura);
        System.out.println(peste);

        friptura.serveste();
        peste.serveste();

        Factory bucatarie2 = Factory.getInstance("medium rare","carne alba");
        FelPrincipal friptura2 = bucatarie2.getProdus(Fel.FRIPTURA,450,49.99f,"Caru cu Bere",true);
        FelPrincipal peste2 = bucatarie2.getProdus(Fel.PESTE,250,45.89f,"Caru cu Bere",true);

        System.out.println(friptura2);
        System.out.println(peste2);

        friptura2.serveste();
        peste2.serveste();
    }
}
