package cts.selavardeanu.adrian.g1099.main;

import cts.selavardeanu.adrian.g1099.factory.*;
import cts.selavardeanu.adrian.g1099.models.AAnimal;

public class Main {
    public static void main(String[] args) {
        IFactory dogs = CaineFactory.getInstanta(100,2);
        IFactory fabricaCateilor = CaineFactory.getInstanta(50,4);
        IFactory cats = new PisicaFactory("peste","fundita");
        IFactory fabricaPisicilor = new PisicaFactory("lapte","clopotel");

        AAnimal bichon = dogs.getAnimal(TipCaine.BICHON,"Elsa",10);
        AAnimal rottweiler = fabricaCateilor.getAnimal(TipCaine.ROTTWEILER,"Max",5);
        AAnimal britishShorthair = cats.getAnimal(TipPisica.BRITISH_SHORTHAIR,"Aldo",12);
        AAnimal maiencoon = fabricaPisicilor.getAnimal(TipPisica.MAINE_COON,"Kiss",8);

        System.out.println(bichon.toString());
        System.out.println(rottweiler.toString());
        System.out.println(britishShorthair.toString());
        System.out.println(maiencoon.toString());




    }
}
