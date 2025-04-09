package cts.selavardeanu.adrian.g1099.factory;

import cts.selavardeanu.adrian.g1099.models.AAnimal;
import cts.selavardeanu.adrian.g1099.models.Bichon;
import cts.selavardeanu.adrian.g1099.models.Rottweiler;

public class CaineFactory implements IFactory{

    private int nivelLatrat;
    private int nrPlimbari;

    private static CaineFactory instanta;

   private CaineFactory(int nivelLatrat, int nrPlimbari) {
        this.nivelLatrat = nivelLatrat;
        this.nrPlimbari = nrPlimbari;
    }

    public synchronized static CaineFactory getInstanta(int nivelLatrat, int nrPlimbari)
    {
        if (instanta == null) {
            instanta = new CaineFactory(nivelLatrat, nrPlimbari);
        }
        return instanta;
    }

    @Override
    public AAnimal getAnimal(ITipAnimal tip, String nume, int varsta) {
        return switch (tip){
            case TipCaine.BICHON -> new Bichon(nume,varsta,this.nivelLatrat,this.nrPlimbari);
            case TipCaine.ROTTWEILER -> new Rottweiler(nume,varsta,this.nivelLatrat,this.nrPlimbari);
            default -> null;
        };
    }
}
