package modules;

public class Rezervare implements IRezervare{

    @Override
    public void rezervare(String numeClient, int nrPersoane) {
        System.out.println("Rezervarea pe numele " + numeClient + " - " + nrPersoane + " persoane");
    }
}
