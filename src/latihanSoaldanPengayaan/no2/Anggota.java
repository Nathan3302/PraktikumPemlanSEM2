package latihanSoaldanPengayaan.no2;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String nama;
    private String nomorAnggota;
    private List<Buku> riwayatPeminjaman = new ArrayList<>();

    public Anggota(){

    }
    public Anggota (String nama, String nomorAnggota){
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorAnggota(String nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public void setRiwayatPeminjaman(Buku riwayatPeminjaman) {
        this.riwayatPeminjaman.add(riwayatPeminjaman);
    }

    public String getNama() {
        return nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    // constructor, getter, setter, dan method lainnya
}