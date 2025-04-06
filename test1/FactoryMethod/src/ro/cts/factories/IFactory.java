package ro.cts.factories;

import ro.cts.models.FelMancare;

public interface IFactory {
    FelMancare getFelMancare(TipFelMancare tip, float pret, int cantitate); //signatura
}
