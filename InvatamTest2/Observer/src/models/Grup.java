package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Grup implements Expeditor{
    private String nume;
    private List<Destinatar> membri;

    public Grup(String nume) {
        this.nume = nume;
        this.membri = new ArrayList<Destinatar>();
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void adaugaObserver(Destinatar destinatar) {
        membri.add(destinatar);
    }

    @Override
    public void stergeObserver(Destinatar destinatar) {
        membri.remove(destinatar);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Destinatar destinatar : membri) {
            destinatar.primesteMesaj(mesaj);
        }
    }

    public abstract void intraNotificare();
}
