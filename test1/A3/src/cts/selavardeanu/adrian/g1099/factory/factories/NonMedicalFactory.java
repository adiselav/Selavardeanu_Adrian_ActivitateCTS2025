package cts.selavardeanu.adrian.g1099.factory.factories;

import cts.selavardeanu.adrian.g1099.factory.models.APersonalSpital;
import cts.selavardeanu.adrian.g1099.factory.models.Contabil;
import cts.selavardeanu.adrian.g1099.factory.models.Manager;

public class NonMedicalFactory implements IFactory{
    private String ciociolata;

    public NonMedicalFactory(String ciociolata) {
        this.ciociolata = ciociolata;
    }

    @Override
    public APersonalSpital getProdus(IPersonal tip, String nume, int salariu) {
        return switch (tip){
            case NonMedical.CONTABIL -> new Contabil(nume, salariu, this.ciociolata);
            case NonMedical.MANAGER -> new Manager(nume, salariu, this.ciociolata);
            default -> null;
        };
    }
}
