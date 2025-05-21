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
        if (this.nrVouchere*this.valoareVoucher>notaPlata)
        {
            System.out.println("Ati platit cu vouchere");
            this.nrVouchere = this.valoareVoucher - (int)notaPlata/this.valoareVoucher;
            System.out.println("Mai aveti " + this.nrVouchere + " vouchere");
        }

    }
}
