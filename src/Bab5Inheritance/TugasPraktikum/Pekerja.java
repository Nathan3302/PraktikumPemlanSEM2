package Bab5Inheritance.TugasPraktikum;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean isLakiLaki, boolean menikah,double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, nik, isLakiLaki, menikah);
        this.gaji = gaji;
        this.tahunMasuk=tahunMasuk;
        this.jumlahAnak=jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public double getBonus(){
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return 0.1 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getTunjangan() {
        return jumlahAnak * 20;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan()+getGaji()+getBonus()+getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() +
                "\nNIK: "+ getNik()+
                "\nJenis Kelamin: "+super.getJenisKelamin()+
                "\nPendapatan: "+this.getPendapatan() +
                "\nTahun Masuk: " + getTahunMasuk() +
                "\nJumlah Anak: " + getJumlahAnak() +
                "\nGaji: " + getGaji();
    }
}
