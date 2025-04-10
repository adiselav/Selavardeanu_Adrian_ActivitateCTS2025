package cts.selavardeanu.adrian.g1099.factory.models;

public class Contabil extends APersonalSpital{
    private String ciociolata;

    public Contabil(String nume, int salariu, String ciociolata) {
        super(nume, salariu);
        this.ciociolata = ciociolata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contabil{");
        sb.append("ciociolata='").append(ciociolata).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void atentie() {
        System.out.println("Fara atentie, dar ciocolata "+ ciociolata);
    }
}
