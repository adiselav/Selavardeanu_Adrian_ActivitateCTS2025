package models;

public abstract class PreparareAbstract {
    protected String denumire;

    public PreparareAbstract(String denumire) {
        this.denumire = denumire;
    }

    protected abstract void spala();
    protected abstract void taie();
    protected abstract void coace();
    protected abstract void serveste();

    public final void preparare(){
        spala();
        taie();
        coace();
        serveste();
    }


}
