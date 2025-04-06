package ro.cts.factories;

import ro.cts.models.FelMancare;
import ro.cts.models.Papanasi;
import ro.cts.models.Tiramisu;

public class DesertFactory implements IFactory{
    private Boolean gem;
    private String aroma;
    private Boolean extraCacao;
    private int nrFelii;

    private static DesertFactory fabrica = null;

    private DesertFactory(Boolean gem, String aroma, Boolean extraCacao, int nrFelii) {
        this.gem = gem;
        this.aroma = aroma;
        this.extraCacao = extraCacao;
        this.nrFelii = nrFelii;
    }

    public synchronized static DesertFactory getIntanta(Boolean gem, String aroma, Boolean extraCacao, int nrFelii){
        if (fabrica == null) {
            fabrica = new DesertFactory(gem, aroma, extraCacao, nrFelii);
        }
        return fabrica;
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tip, float pret, int cantitate) {
        return switch (tip){
            case Desert.Papanasi -> new Papanasi(pret,cantitate, this.gem,this.aroma);
            case Desert.Tiramisu -> new Tiramisu(pret, cantitate, this.extraCacao, this.nrFelii);
            default -> null;
        };
    }
}
