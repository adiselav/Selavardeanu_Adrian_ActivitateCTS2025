package cts.Selavardeanu.Adrian.G1099;

public class Internare {
    private String nume;

    //optional

    private boolean patRabatabil;
    private boolean hasMicDejun;

    public Internare(String nume, boolean patRabatabil, boolean hasMicDejun) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.hasMicDejun = hasMicDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", hasMicDejun=").append(hasMicDejun);
        sb.append('}');
        return sb.toString();
    }
}
