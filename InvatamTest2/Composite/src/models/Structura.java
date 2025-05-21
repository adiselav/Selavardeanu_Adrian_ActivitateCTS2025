package models;

public interface Structura {
    void adaugaNod(Structura structura) throws Exception;
    void stergeNod(Structura structura) throws Exception;
    Structura getNodCopil(int index) throws Exception;
    void descriereStrcutura(String indent) throws Exception;

}
