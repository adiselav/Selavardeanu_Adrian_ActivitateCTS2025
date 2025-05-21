package modules;

public class FelicitareDeCraciun extends FelicitareDecorata{
    public FelicitareDeCraciun(IFelicitare iFelicitare) {
        super(iFelicitare);
    }

    @Override
    public void mesajSpecific() {
        System.out.println("Craciun fericit!");

    }
}
