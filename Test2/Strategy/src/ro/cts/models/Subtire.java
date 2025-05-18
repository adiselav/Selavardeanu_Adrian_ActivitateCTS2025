package ro.cts.models;

public class Subtire implements IPizza{
    private String blatClient;

    public Subtire(String blatClient) {
        this.blatClient = blatClient;
    }

    @Override
    public void blat(String tipBlat) {
        if (this.blatClient.equals(tipBlat)){
            System.out.println("Va servim blatul " + this.blatClient);
        }
        else{
            System.out.println("Alegeti alt blat ");
        }
    }
}