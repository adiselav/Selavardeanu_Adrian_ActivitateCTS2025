package models;

public abstract class Handler {
    protected Handler urmatorul;

    public void setUrmatorul(Handler urmatorul) {
        this.urmatorul = urmatorul;
    }

    public Handler getUrmatorul() {
        return urmatorul;
    }

    public abstract void recomanda(int nrPile);
}
