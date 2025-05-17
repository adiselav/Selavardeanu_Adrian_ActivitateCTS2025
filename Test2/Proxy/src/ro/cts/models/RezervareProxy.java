package ro.cts.models;

public class RezervareProxy implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        if(numarPersoane >= 4){
            rezervare.rezerva(numeClient, numarPersoane);
        } else {
            System.out.println("Nu este nevoie de rezervare!");
        }

    }
}