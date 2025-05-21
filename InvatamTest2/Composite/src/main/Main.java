package main;

import models.GrupParlamentar;
import models.Parlamentar;
import models.Structura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Structura psd = new GrupParlamentar("PSD");
        Structura aur = new GrupParlamentar("AUR");

        Structura parlamentar1 = new Parlamentar("Leontin Leontinescu","Giurgiu");
        Structura parlamentar2 = new Parlamentar("Ludovic Ludovidescu","Vaslui");
        Structura parlamentar3 = new Parlamentar("Leopold Leopoldescu","Salaj");
        Structura parlamentar4 = new Parlamentar("Laur Laurescu","Tulcea");
        Structura parlamentar5 = new Parlamentar("Liviu Liviescu","Bucuresti");
        Structura parlamentar6 = new Parlamentar("Gigi Gigescu","Teleorman");

        psd.adaugaNod(parlamentar4);
        psd.adaugaNod(parlamentar5);
        aur.adaugaNod(parlamentar1);
        aur.adaugaNod(parlamentar2);
        aur.adaugaNod(parlamentar3);

        List<Structura> CameraDepitatilor = new ArrayList<Structura>();
        CameraDepitatilor.add(psd);
        CameraDepitatilor.add(aur);
        CameraDepitatilor.add(parlamentar6);

        for (Structura structura : CameraDepitatilor) {
            structura.descriereStrcutura("");
        }








    }
}
