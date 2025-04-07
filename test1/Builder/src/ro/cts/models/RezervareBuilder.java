package ro.cts.models;

public class RezervareBuilder implements IBuilder{
    protected Rezervare rezervare;

    public RezervareBuilder(String nume) {
        this.rezervare = new Rezervare(nume, 2, "18:00", "Luni", 200, false);
    }

    @Override
    public Rezervare getRezervare() {
        return this.rezervare;
    }

    @Override
    public IBuilder setNume(String nume) {
        rezervare.setNume(nume);
        return this;
    }

    @Override
    public IBuilder setNrPersoane(int nrPersoane) {
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }

    @Override
    public IBuilder setOra(String ora) {
        rezervare.setOra(ora);
        return this;
    }

    @Override
    public IBuilder setZi(String zi) {
        rezervare.setZi(zi);
        return this;
    }

    @Override
    public IBuilder setPretMinim(float pretMinim) {
        rezervare.setPretMinim(pretMinim);
        return this;
    }

    @Override
    public IBuilder setFumator(Boolean fumator) {
        rezervare.setFumator(fumator);
        return this;
    }
}
