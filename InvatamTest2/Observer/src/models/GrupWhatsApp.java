package models;

public class GrupWhatsApp extends Grup{
    public GrupWhatsApp(String nume) {
        super(nume);
    }

    @Override
    public void intraNotificare() {
            trimiteMesaj("Ai o notificare de la Grupul " + this.getNume());
    }
}
