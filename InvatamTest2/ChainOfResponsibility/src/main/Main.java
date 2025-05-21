package main;

import models.*;

public class Main {
    public static void main(String[] args) {

        Handler ghiseu1=new Ghiseu1();
        Handler ghiseu2=new Ghiseu2();
        Handler ghiseu3=new Ghiseu3();
        Handler ghiseu4=new Ghiseu4();

        ghiseu1.setUrmatorul(ghiseu2);
        ghiseu2.setUrmatorul(ghiseu3);
        ghiseu3.setUrmatorul(ghiseu4);

        ghiseu1.recomanda(7);
        ghiseu1.recomanda(4);
        ghiseu1.recomanda(2);
        ghiseu1.recomanda(0);

    }
}
