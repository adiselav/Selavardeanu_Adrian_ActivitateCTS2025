package as.cts;

public class Main {
    public static void main(String[] args) {

        MinisterulEnergiei MinisterulEnergieiRomania =  MinisterulEnergiei.getMinisterulEnergiei("Sebastian Burduja", 1000000.00F,255);
        MinisterulEnergiei MinisterulEnergieiBulgariei =  MinisterulEnergiei.getMinisterulEnergiei("Rosen Zhelyazkov", 5000000.00F,533);

        System.out.println(MinisterulEnergieiBulgariei.toString());

    }
}
