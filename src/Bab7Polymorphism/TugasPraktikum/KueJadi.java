package Bab7Polymorphism.TugasPraktikum;

public class KueJadi extends Kue{
    private double jumlah;

    public KueJadi (String nama, double harga, double jumlah){
        super.setNama(nama);
        super.setHarga(harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return super.getHarga() * jumlah * 2;
    }
}
