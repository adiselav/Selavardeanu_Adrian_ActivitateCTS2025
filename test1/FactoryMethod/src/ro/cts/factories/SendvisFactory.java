package ro.cts.factories;

import ro.cts.models.FelMancare;
import ro.cts.models.SendvisSalam;
import ro.cts.models.SendvisSunca;

public class SendvisFactory implements IFactory{
    private String tipSalam;
    private boolean salata;
    private int feliiSunca;
    private String tipPaine;

    public SendvisFactory(String tipSalam, boolean salata, int feliiSunca, String tipPaine) {
        this.tipSalam = tipSalam;
        this.salata = salata;
        this.feliiSunca = feliiSunca;
        this.tipPaine = tipPaine;
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tip, float pret, int cantitate) {
        return switch (tip){
            case Sendvis.SendvisSalam -> new SendvisSalam(pret, cantitate, this.tipSalam, this.salata);
            case Sendvis.SenvisSunca -> new SendvisSunca(pret, cantitate, this.feliiSunca, this.tipPaine);
            default -> null;
        };
    }
}
