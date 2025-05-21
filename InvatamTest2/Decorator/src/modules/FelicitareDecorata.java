package modules;

public abstract class FelicitareDecorata implements IFelicitare{
    private IFelicitare iFelicitare;

    public FelicitareDecorata(IFelicitare iFelicitare) {
        this.iFelicitare = iFelicitare;
    }

    @Override
    public void urare() {
        iFelicitare.urare();
        mesajSpecific();
    }

    public abstract void mesajSpecific();
}
