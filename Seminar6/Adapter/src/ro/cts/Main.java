package ro.cts;

import ro.cts.models.AdaptorMedicament;
import ro.cts.models.MedicamentFarmacie;
import ro.cts.models.MedicamentSpital;

public class Main {


    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Coldrex Maxgrip Lemon",30,true, "01.05.2025");
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Gaviscon Mentol", 30);
        AdaptorMedicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        vindeMedicamente(adaptorMedicament);
    }
}
