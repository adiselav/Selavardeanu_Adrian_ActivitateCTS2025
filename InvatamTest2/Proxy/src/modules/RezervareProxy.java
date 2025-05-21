package modules;

public class RezervareProxy implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervare(String numeClient, int nrPersoane) {
        if (nrPersoane>=4){
            rezervare.rezervare(numeClient,nrPersoane);
        }
        else {
            System.out.println("Nu este necesara rezervarea!");
        }

    }
}
