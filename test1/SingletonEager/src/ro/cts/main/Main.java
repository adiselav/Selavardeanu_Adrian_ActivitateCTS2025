package ro.cts.main;


import ro.cts.models.CET;

public class Main {
    public static void main(String[] args) {
        CET centrala = CET.getInstanta();

        System.out.println(centrala);

        CET centrala2 = CET.getInstanta();
        centrala2.setDenumireCentrala("CET TITAN");

        System.out.println(centrala2);
        System.out.println(centrala);



    }
}
