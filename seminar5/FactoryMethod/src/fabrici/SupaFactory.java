package fabrici;

import models.FelMancare;
import models.SupaCiuperci;
import models.SupaLegume;

public class SupaFactory implements TipMancareFactory{
    private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitte(int cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        return switch(tip){
            case Supe.SupaCiuperci -> new SupaCiuperci(pret, nrCalorii, this.cantitate) ;
            case Supe.SupaLegume ->  new SupaLegume( pret, nrCalorii,this.cantitate);
            default -> null;
        };
    }
}
