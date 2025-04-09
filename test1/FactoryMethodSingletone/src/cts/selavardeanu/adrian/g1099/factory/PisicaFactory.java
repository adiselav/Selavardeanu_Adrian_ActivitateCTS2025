package cts.selavardeanu.adrian.g1099.factory;

import cts.selavardeanu.adrian.g1099.models.AAnimal;
import cts.selavardeanu.adrian.g1099.models.BritishShorthair;
import cts.selavardeanu.adrian.g1099.models.MaineCoon;

public class PisicaFactory implements IFactory{

    private String mancare;
    private String decoratiune;

    public PisicaFactory(String mancare, String decoratiune) {
        this.mancare = mancare;
        this.decoratiune = decoratiune;
    }

    @Override
    public AAnimal getAnimal(ITipAnimal tip, String nume, int varsta) {
        return switch (tip)
        {
            case TipPisica.BRITISH_SHORTHAIR -> new BritishShorthair(nume,varsta,this.mancare,this.decoratiune);
            case TipPisica.MAINE_COON -> new MaineCoon(nume,varsta,this.mancare,this.decoratiune);
            default -> null;
        };
    }
}
