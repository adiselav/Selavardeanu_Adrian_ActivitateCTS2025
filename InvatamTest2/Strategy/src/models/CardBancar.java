package models;

public class CardBancar implements IPlata{

    float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float notaPlata) {
        if (this.sold>notaPlata){
            this.sold -= notaPlata;
            System.out.println("Tranzactie acceptata");
        }
        else System.out.println("Tranzactie refuzata, fonduri insuficiente");

    }
}
