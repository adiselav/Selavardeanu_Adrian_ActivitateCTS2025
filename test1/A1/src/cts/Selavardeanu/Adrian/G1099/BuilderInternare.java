package cts.Selavardeanu.Adrian.G1099;

public class BuilderInternare implements IBuilder{
    private String nume;
    private boolean patRabatabil;
    private boolean hasMicDejun;

    public BuilderInternare() {
        this.nume = "Leontin";
        this.patRabatabil = false;
        this.hasMicDejun = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume, this.patRabatabil, this.hasMicDejun);

    }

    @Override
    public IBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public IBuilder setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
        return this;
    }
}
