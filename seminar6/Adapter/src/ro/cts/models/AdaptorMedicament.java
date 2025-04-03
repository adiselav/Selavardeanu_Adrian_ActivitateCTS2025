package ro.cts.models;

public class AdaptorMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;


    public AdaptorMedicament(String nume, int pret, boolean stoc, String dataExpirare) {
        super(nume, pret, stoc, dataExpirare);
    }

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(),true, "12.04.2025");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }

}
