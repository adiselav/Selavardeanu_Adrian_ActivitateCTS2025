package models;

public class Voucher implements IPlata{
    private int nrVouchere;
    private int valoareVoucher;

    public Voucher(int nrVouchere, int valoareVoucher) {
        this.nrVouchere = nrVouchere;
        this.valoareVoucher = valoareVoucher;
    }

    @Override
    public void plateste(float notaPlata) {


        int vouchereNecesare = (int)Math.ceil(notaPlata / this.valoareVoucher);

        if (this.nrVouchere >= vouchereNecesare) {
            System.out.println("Ati platit cu vouchere");
            this.nrVouchere -= vouchereNecesare;
            System.out.println("Mai aveti " + this.nrVouchere + " vouchere");
        } else {
            System.out.println("Fonduri insuficiente ");
        }
    }
}
