package models;

public class SDCard {
    private float memorie;
    private String firma;

    public SDCard(float memorie, String firma) {
        this.memorie = memorie;
        this.firma = firma;
    }

    public void detaliiCard(){
        System.out.println("Cardul de la " + this.firma + " are capacitate " + this.memorie);
    }
    public void prezintaPoze(){
        System.out.println("Pe card aveti poze");
        detaliiCard();
    }

    public float getMemorie() {
        return memorie;
    }

    public String getFirma() {
        return firma;
    }
}
