package ro.cts.models;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        System.out.println("Rezervare realizata pentru " + numeClient + " - " + numarPersoane + " persoane.");
    }
}
