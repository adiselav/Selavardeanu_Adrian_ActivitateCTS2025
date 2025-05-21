package main;

import models.Preparare;
import models.PreparareAbstract;

public class Main {
    public static void main(String[] args) {
        PreparareAbstract felDeMancare = new Preparare("burger");

        System.out.println();
        felDeMancare.preparare();
    }
}
