package cts.selavardeanu.adrian.g1099.factory.factories;

import cts.selavardeanu.adrian.g1099.factory.models.APersonalSpital;

public interface IFactory {
    APersonalSpital getProdus(IPersonal tip, String nume, int salariu);
}
