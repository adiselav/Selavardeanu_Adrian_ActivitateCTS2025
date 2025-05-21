package models;

public class Preparare extends PreparareAbstract{

    public Preparare(String denumire) {
        super(denumire);
    }

    @Override
    protected void spala() {
        System.out.println("spala legumele");

    }

    @Override
    protected void taie() {
        System.out.println("taie legumele");
    }

    @Override
    protected void coace() {
        System.out.println("baga la cuptor");
    }

    @Override
    protected void serveste() {
        System.out.println("pofta buna");
    }
}
