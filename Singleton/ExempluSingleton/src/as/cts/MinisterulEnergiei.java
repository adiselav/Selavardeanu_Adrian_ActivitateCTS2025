package as.cts;

public class MinisterulEnergiei {
    private String ministru;
    private Float buget;
    private int angajati;
    private static MinisterulEnergiei ministerulEnergiei = null;

    private MinisterulEnergiei(String ministru, Float buget, int angajati) {
        this.ministru = ministru;
        this.buget = buget;
        this.angajati = angajati;
    }

    public synchronized static MinisterulEnergiei getMinisterulEnergiei(String ministru, Float buget, int angajati)  {
        if (ministerulEnergiei == null) {
            ministerulEnergiei = new MinisterulEnergiei(ministru, buget, angajati);
        }
        return ministerulEnergiei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MinisterulEnergiei{");
        sb.append("ministru='").append(ministru).append('\'');
        sb.append(", buget=").append(buget);
        sb.append(", angajati=").append(angajati);
        sb.append('}');
        return sb.toString();
    }
}
