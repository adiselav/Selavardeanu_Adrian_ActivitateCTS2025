package ro.registru.clase;

public class Main {
    public static void main(String[] args) {
        RegistrulComertului registru = new RegistrulComertului("9-5",50000000);
        Firma firma1 = registru.getFirma("SC Leontin SRL",1000000,"Piata Romana nr. 1",10);
        Firma firma2 = registru.getFirma("SC Electrica SA",900000000,"Bd. Basarabia nr. 115",500);
        Firma firma3 = registru.getFirma("SC Leontin SRL",5000000,"Piata Victoriei nr. 1",20);

        System.out.println(firma1);
        System.out.println(firma2);
        System.out.println(firma3);

    }
}
