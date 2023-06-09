package latihanSoaldanPengayaan.no2;
public interface Peminjaman {
    void pinjamBuku(Buku buku, Anggota anggota);
    void kembalikanBuku(Buku buku, Anggota anggota);
}
