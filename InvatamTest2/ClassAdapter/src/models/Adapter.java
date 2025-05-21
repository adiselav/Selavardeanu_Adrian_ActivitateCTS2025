package models;

public class Adapter extends SDCard implements IMicroSD {
    public Adapter(float memorie, String firma) {
        super(memorie, firma);
    }

    @Override
    public void acceseazaMicroSD() {
        super.prezintaPoze();
    }
}
