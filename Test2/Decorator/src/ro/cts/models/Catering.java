package ro.cts.models;

public class Catering extends DecoratorLocale{

    public Catering(Local local) {
        super(local);
    }

    @Override
    protected void meniu() {
        System.out.println("La Catering se serveste ciorba");
    }
}
