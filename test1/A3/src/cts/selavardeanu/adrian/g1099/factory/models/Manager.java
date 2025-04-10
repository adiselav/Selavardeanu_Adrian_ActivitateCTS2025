package cts.selavardeanu.adrian.g1099.factory.models;

public class Manager extends APersonalSpital{
    private String ciociolata;

    public Manager(String nume, int salariu, String ciociolata) {
        super(nume, salariu);
        this.ciociolata = ciociolata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("ciociolata='").append(ciociolata).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void atentie() {
        System.out.println("Fara atentie, dar ciocolata "+ ciociolata);
    }


}
