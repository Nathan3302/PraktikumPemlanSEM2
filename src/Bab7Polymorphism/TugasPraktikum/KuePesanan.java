package Bab7Polymorphism.TugasPraktikum;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan (String nama, double harga, double berat){
        super.setNama(nama);
        super.setHarga(harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return super.getHarga() * berat;
    }
}
