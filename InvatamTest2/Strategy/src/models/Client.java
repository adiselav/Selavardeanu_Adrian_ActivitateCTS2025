package models;

public class Client {
    private String denumire;
    private IPlata metodaPlata;

    public Client(String denumire, IPlata metodaPlata) {
        this.denumire = denumire;
        this.metodaPlata = metodaPlata;
    }

    public Client(String denumire) {
        this.denumire = denumire;
        this.metodaPlata = new CardBancar(100);
    }

    public void setMetodaPlata(IPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteMasa(float pret){
        this.metodaPlata.plateste(pret);
    }
}
