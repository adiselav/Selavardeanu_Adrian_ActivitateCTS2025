package cts.selavardeanu.adrian.g1099;

public class Main {
    public static void main(String[] args) {
        AReteta reteta1 = new Reteta("Leon","Leontin","Nurofen",true,2);
        AReteta reteta2 = reteta1.clonare();

        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());

        reteta1.citire();

    }
}
