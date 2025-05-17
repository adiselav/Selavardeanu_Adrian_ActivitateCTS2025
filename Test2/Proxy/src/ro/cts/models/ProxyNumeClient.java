package ro.cts.models;

public class ProxyNumeClient implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare){
        this.rezervare = rezervare;
    }
    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        if(numeClient.length() > 5){
            this.rezervare.rezerva(numeClient, numarPersoane);
        }
        else{
            System.out.println("Nu va este permisa rezervarea.");
        }
    }
}