package Bab6ArrayList;

public class Main {
    public static void main(String[] args) {
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));
        // Lakukan modifikasi data tambah mahasiswa ...
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi Darmawan","Sistem Informasi",false);
        DataMahasiswa.tambahMahasiswa(mahasiswa1);
        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();
        // Method cariMahasiswa (jika data ada)
        DataMahasiswa.cariMahasiswa("Grenda Jamaludin");
        // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Grenda Jamaludi");
        // Method tampilMahasiswa (sebelum diupdate)
        DataMahasiswa.tampilMahasiswa(DataMahasiswa.cariMahasiswa("Denar Abidin"));
        DataMahasiswa.updateMahasiswa("Denar Abidin","Denar Nasution","Teknik Informatika",true);
        // Method tampilMahasiswa (setelah diupdate)
        DataMahasiswa.tampilMahasiswa(DataMahasiswa.cariMahasiswa("Denar Nasution"));
    }
}