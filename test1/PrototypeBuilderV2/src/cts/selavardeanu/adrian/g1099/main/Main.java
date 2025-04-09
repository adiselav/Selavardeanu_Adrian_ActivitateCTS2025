package cts.selavardeanu.adrian.g1099.main;

import cts.selavardeanu.adrian.g1099.models.ARezervare;
import cts.selavardeanu.adrian.g1099.models.IBuilder;
import cts.selavardeanu.adrian.g1099.models.Rezervare;
import cts.selavardeanu.adrian.g1099.models.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        ARezervare rezervare1 = new Rezervare("Adrian",2,1000,2,new String[]{"per1","pers2"},true,true,2);
        ARezervare rezervare2 = rezervare1.clonare();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

        IBuilder builder = new RezervareBuilder();
        Rezervare rezervare3 = builder.buildRezervare("Leon",2,100);
        Rezervare rezervare4 = builder.setNrBai(2).setHasBalcon(true).setFumator(true).setPersoane(new String[]{"Adi","Cata"}).buildRezervare("Adrian",3,300);

        System.out.println(rezervare3.toString());
        System.out.println(rezervare4.toString());

        ARezervare rezervare5 = rezervare4.clonare();
        System.out.println(rezervare5.toString());


    }
}
