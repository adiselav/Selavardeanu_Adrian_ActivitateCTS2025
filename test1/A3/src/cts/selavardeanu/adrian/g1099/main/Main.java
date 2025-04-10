package cts.selavardeanu.adrian.g1099.main;

import cts.selavardeanu.adrian.g1099.factory.factories.*;
import cts.selavardeanu.adrian.g1099.factory.models.APersonalSpital;

public class Main {
    public static void main(String[] args) {
        IFactory fabricaDeMedici = new MedicalFactory(1000);
        IFactory fabricaDeNonMedici = new NonMedicalFactory("Leonida's");
        APersonalSpital asistenta = fabricaDeMedici.getProdus(Medical.ASISTENTA, "Leontina",5000);
        APersonalSpital doctor = fabricaDeMedici.getProdus(Medical.DOCTOR, "Leontin",10000);
        APersonalSpital contabil = fabricaDeNonMedici.getProdus(NonMedical.CONTABIL, "Tanti Vali",10000);
        APersonalSpital manager= fabricaDeNonMedici.getProdus(NonMedical.MANAGER, "Nea Vali",20000);

        System.out.println(asistenta.toString());
        System.out.println(doctor.toString());
        System.out.println(contabil.toString());
        System.out.println(manager.toString());

    }
}
