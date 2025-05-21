package modules;

public class Ghiseu {
    private int nrGhiseu;
    private int nrActe;
    private boolean aesteLiber;

    public Ghiseu(int nrGhiseu, int nrActe, boolean aesteLiber) {
        this.nrGhiseu = nrGhiseu;
        this.nrActe = nrActe;
        this.aesteLiber = aesteLiber;
    }

    public int getNrGhiseu() {
        return nrGhiseu;
    }

    public void setNrGhiseu(int nrGhiseu) {
        this.nrGhiseu = nrGhiseu;
    }

    public int getNrActe() {
        return nrActe;
    }

    public void setNrActe(int nrActe) {
        this.nrActe = nrActe;
    }

    public boolean isAesteLiber() {
        return aesteLiber;
    }

    public void setAesteLiber(boolean aesteLiber) {
        this.aesteLiber = aesteLiber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ghiseu{");
        sb.append("nrGhiseu=").append(nrGhiseu);
        sb.append(", nrActe=").append(nrActe);
        sb.append(", aesteLiber=").append(aesteLiber);
        sb.append('}');
        return sb.toString();
    }
}
