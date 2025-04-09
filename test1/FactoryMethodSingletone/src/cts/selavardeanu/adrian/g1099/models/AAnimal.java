package cts.selavardeanu.adrian.g1099.models;

public abstract class AAnimal {
    protected String nume;
    protected int varsta;

    public AAnimal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AAnimal{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
