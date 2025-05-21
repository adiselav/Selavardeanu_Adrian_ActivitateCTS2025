package main;

import models.AgentieTuristica;
import models.Optionale;

public class Main {
    public static void main(String[] args){

        System.out.println();

        AgentieTuristica agentie = new AgentieTuristica();

        agentie.putPachetTuristic(1024,"Leontin",2);
        agentie.putPachetTuristic(2048,"Leopold",4);
        agentie.putPachetTuristic(4096,"Liviu",1);

        Optionale optionale1 = new Optionale(true, 5);
        Optionale optionale2 = new Optionale(false, 3);
        
        try {
            agentie.getPachetTuristic(1024).rezerva(optionale1);
            agentie.getPachetTuristic(2048).rezerva(optionale2);
            agentie.getPachetTuristic(4096).rezerva(optionale2);
            agentie.getPachetTuristic(1000).rezerva(optionale2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
