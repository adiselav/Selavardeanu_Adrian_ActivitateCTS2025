package ro.cts.models;

public class Livrator {
    private String nume;
    private boolean isNepalez;

    public Livrator(String nume, boolean isNepalez) {
        this.nume = nume;
        this.isNepalez = isNepalez;
    }

    public void Glovo(IProdusDelivery produsDelivery){
        System.out.println(this.nume + " va livreaza produsul ");
        produsDelivery.livrareProdus();
        if (isNepalez){
            System.out.println("English please");
        }
        else{
            System.out.println("Poftim bossule");
        }
    }
}
