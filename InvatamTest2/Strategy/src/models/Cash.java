package models;

public class Cash implements IPlata{
    private int bancnota;

    public Cash(int bancnota) {
        this.bancnota = bancnota;
    }

    @Override
    public void plateste(float notaPlata) {
        if (this.bancnota>notaPlata){
            System.out.println("Restul dumneavoastra este: " + (this.bancnota-notaPlata) + " lei");
        }
        else System.out.println("Fonduri insuficiente");

    }
}
