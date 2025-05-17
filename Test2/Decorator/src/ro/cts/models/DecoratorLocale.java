package ro.cts.models;

public abstract class DecoratorLocale implements Local{
    private Local local;

    public DecoratorLocale(Local local) {
        this.local = local;
    }

    @Override
    public void serveste() {
        local.serveste();
        meniu();
    }

    protected abstract void meniu();
}
