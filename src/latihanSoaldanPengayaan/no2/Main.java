package latihanSoaldanPengayaan.no2;

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Rendy","123456");
        Anggota anggota2 = new Anggota("Rihana","3459035");
        Buku buku1 = new Buku("Algoritma Pemrograman","Susan",2013);
        Buku buku2 = new Buku("Sistem Jaringan Komputer","Budi",2020);
        Perpustakaan perpus = new Perpustakaan();
        perpus.pinjamBuku(buku1,anggota1);
        perpus.pinjamBuku(buku2,anggota2);
        perpus.pinjamBuku(buku2,anggota1);
        perpus.kembalikanBuku(buku1,anggota1);
        perpus.kembalikanBuku(buku1,anggota2);
        // Jalankan kode program disini
    }
}
