package Bab5Inheritance.TugasPraktikum;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, String nik, boolean isLakiLaki, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, nik, isLakiLaki, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getTunjangan(){
        return super.getTunjangan()+(0.1*getGaji());
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+(0.1*getGaji());
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() +
                "\nNIK: "+ getNik()+
                "\nJenis Kelamin: "+super.getJenisKelamin()+
                "\nPendapatan: "+this.getPendapatan() +
                "\nTahun Masuk: " + getTahunMasuk() +
                "\nJumlah Anak: " + getJumlahAnak() +
                "\nGaji: " + getGaji()+
                "\nDepartemen: "+getDepartemen();

    }
}
