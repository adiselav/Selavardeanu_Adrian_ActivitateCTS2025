package models;

public interface Expeditor {
    void adaugaObserver(Destinatar destinatar);
    void stergeObserver(Destinatar destinatar);
    void trimiteMesaj(String mesaj);
}
