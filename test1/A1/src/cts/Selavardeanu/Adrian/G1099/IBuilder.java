package cts.Selavardeanu.Adrian.G1099;

public interface IBuilder {
    Internare build(String nume);
    IBuilder setPatRabatabil(boolean patRabatabil);
    IBuilder setHasMicDejun(boolean hasMicDejun);
}
