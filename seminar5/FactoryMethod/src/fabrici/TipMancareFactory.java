package fabrici;

import models.FelMancare;

public interface TipMancareFactory {
    FelMancare prepareFelMancare(TipFelMancare tip, float pret, int nrCalorii);
}
