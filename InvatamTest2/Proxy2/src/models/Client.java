package models;

public class Client implements IClient{

    private int varsta;
    private String nume;
    private float bani;

    public Client(int varsta, String nume, float bani) {
        this.varsta = varsta;
        this.nume = nume;
        this.bani = bani;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public float getBani() {
        return bani;
    }

    @Override
    public void cumparaTigari(int varsta, float pret) {
        if (pret<this.bani){
            System.out.println("Poftim tigari boss!");
        } else {
            System.out.println("Valea de aici saracule!");
        }
    }
}
