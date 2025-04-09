package cts.selavardeanu.adrian.g1099.models;

public class MaineCoon extends AAnimal{

    private String mancare;
    private String decoratiune;

    public MaineCoon(String nume, int varsta, String mancare, String decoratiune) {
        super(nume, varsta);
        this.mancare = mancare;
        this.decoratiune = decoratiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MaineCoon{");
        sb.append("mancare='").append(mancare).append('\'');
        sb.append(", decoratiune='").append(decoratiune).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
