package cts.selavardeanu.adrian.g1099.factory;

import cts.selavardeanu.adrian.g1099.models.AAnimal;

public interface IFactory {
    AAnimal getAnimal(ITipAnimal tip, String nume, int varsta);
}
