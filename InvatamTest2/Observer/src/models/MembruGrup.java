package models;

public class MembruGrup implements Destinatar{
    private String nume;
    private String telefon;
    private int varsta;

    public MembruGrup(String nume, String telefon, int varsta) {
        this.nume = nume;
        this.telefon = telefon;
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + ", ai primit urmatorul mesaj: " + mesaj);

    }
}
