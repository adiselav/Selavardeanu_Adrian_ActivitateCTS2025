package ro.cts.models;

public class Prezidentiabil implements IPizza{
    private boolean aiVotat;

    public Prezidentiabil(boolean aiVotat) {
        this.aiVotat = aiVotat;
    }

    @Override
    public void blat(String tipBlat) {
        if(aiVotat){
            System.out.println("Va servim blatul prezidentiabil");
        }
        else{
            System.out.println("Mergi la vot!");
        }
    }
}
