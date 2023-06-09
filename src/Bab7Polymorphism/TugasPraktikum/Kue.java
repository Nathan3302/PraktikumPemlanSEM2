package Bab7Polymorphism.TugasPraktikum;

public abstract class Kue {
    private String nama;
    private double harga;
    public abstract double hitungHarga();
    public String toString (){
        return "Nama kue: "+this.nama+ "\nHarga: "+this.harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
