package ro.cts.models;

public class Italian implements IPizza{
    private int diametru;

    public Italian(int diametru) {
        this.diametru = diametru;
    }

    @Override
    public void blat(String tipBlat) {
        if (diametru > 40){
                System.out.println("Va servim blatul italian");
            }
            else{
                System.out.println("Alegeti alt blat ");
            }
        }
    }
