package models;

public class Ghiseu1 extends Handler{
    @Override
    public void recomanda(int nrPile) {
        if (nrPile>5){
            System.out.println("Poftiti aici");
        }
        else{
            System.out.println("Nu la mine, la colega");
            super.getUrmatorul().recomanda(nrPile);
        }

    }
}
