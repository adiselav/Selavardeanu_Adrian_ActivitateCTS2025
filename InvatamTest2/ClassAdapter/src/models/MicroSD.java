package models;

public class MicroSD implements IMicroSD{
    private float memorie;
    private String firma;
    private String telefon;

    public MicroSD(float memorie, String firma, String telefon) {
        this.memorie = memorie;
        this.firma = firma;
        this.telefon = telefon;
    }

    @Override
    public void acceseazaMicroSD() {
        System.out.println("Nu mai este spatiu in telefon " + this.telefon + " trecem pe microSD");
    }
}
