package models;

public class Parlamentar implements Structura{
    private String nume;
    private String circumscriptie;

    public Parlamentar(String nume, String circumscriptie) {
        this.nume = nume;
        this.circumscriptie = circumscriptie;
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatiunea");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatiunea");
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new Exception("Nu se poate realiza operatiunea");
    }

    @Override
    public void descriereStrcutura(String indent) throws Exception {
        System.out.println(indent + "Parlamentarul " + this.nume + " circumscriptia " + this.circumscriptie);

    }
}
