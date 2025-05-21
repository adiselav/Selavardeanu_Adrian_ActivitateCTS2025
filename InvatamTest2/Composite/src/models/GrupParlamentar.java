package models;

import java.util.ArrayList;
import java.util.List;

public class GrupParlamentar implements Structura{
    private String partid;
    private List<Structura> listaMembri;

    public GrupParlamentar(String partid) {
        this.partid = partid;
        this.listaMembri = new ArrayList<Structura>();
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        listaMembri.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        listaMembri.remove(structura);

    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        return this.listaMembri.get(index);
    }

    @Override
    public void descriereStrcutura(String indent) throws Exception {
        System.out.println("Grupul Parlamentar " + this.partid + ": ");
        for (Structura structura : listaMembri) {
            structura.descriereStrcutura(indent + "\t");
        }
    }
}
