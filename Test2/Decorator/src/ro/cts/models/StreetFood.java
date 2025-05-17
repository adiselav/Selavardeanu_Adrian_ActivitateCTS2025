package ro.cts.models;

public class StreetFood extends DecoratorLocale{

    public StreetFood(Local local) {
        super(local);
    }

    @Override
    protected void meniu() {
        System.out.println("La Street Food se servesc burgeri");
    }
}
