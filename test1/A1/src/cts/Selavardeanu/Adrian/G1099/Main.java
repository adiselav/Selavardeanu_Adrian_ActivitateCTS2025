package cts.Selavardeanu.Adrian.G1099;

public class Main{
    public static void main(String[] args) {
        IBuilder builder = new BuilderInternare();

        Internare internare1 = builder.build("Leontin");
        Internare internare2 = builder.setHasMicDejun(true).setPatRabatabil(true).build("Leontina");

        System.out.println(internare1.toString());
        System.out.println(internare2.toString());

    }
}
