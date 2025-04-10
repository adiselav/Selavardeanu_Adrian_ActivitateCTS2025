package cts.selavardeanu.adrian.g1099.factory.factories;

import cts.selavardeanu.adrian.g1099.factory.models.APersonalSpital;
import cts.selavardeanu.adrian.g1099.factory.models.Asistenta;
import cts.selavardeanu.adrian.g1099.factory.models.Doctor;

public class MedicalFactory implements IFactory {

    private int atentie;

    public MedicalFactory(int atentie) {
        this.atentie = atentie;
    }


    @Override
    public APersonalSpital getProdus(IPersonal tip, String nume, int salariu) {
        return switch (tip) {
            case Medical.ASISTENTA -> new Asistenta(nume,salariu, this.atentie);
            case Medical.DOCTOR -> new Doctor(nume, salariu, this.atentie);
            default -> null;

        };
    }
}
