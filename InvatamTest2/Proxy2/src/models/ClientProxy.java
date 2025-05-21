package models;

public class ClientProxy implements IClient{
    private IClient client;

    public ClientProxy(IClient client) {
        this.client = client;
    }

    @Override
    public void cumparaTigari(int varsta, float pret) {
        if (varsta > 18){
            client.cumparaTigari(varsta,pret);
        }
        else System.out.println("Esti prea mic!");
    }
}
