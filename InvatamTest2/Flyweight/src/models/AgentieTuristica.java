package models;

import java.util.HashMap;

public class AgentieTuristica {
    private HashMap<Integer, IPachet> pacheteTuristice;

    public AgentieTuristica() {
        this.pacheteTuristice = new HashMap<>();
    }

    public IPachet putPachetTuristic(int cod, String nume, int nrPersoane){
        if(!this.pacheteTuristice.containsKey(cod)) {
            this.pacheteTuristice.put(cod, new Pachet(cod, nume, nrPersoane));
        }
        return this.pacheteTuristice.get(cod);
    }

    public IPachet getPachetTuristic(int cod) throws Exception {
        if(this.pacheteTuristice.containsKey(cod)) {
            return this.pacheteTuristice.get(cod);
        } else {
            throw new Exception("Pachetul nr. " + cod + " nu exista");
        }
    }
}
