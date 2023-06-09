package Bab6ArrayList;
import java.util.ArrayList;
class DataMahasiswa {

    private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private static Mahasiswa mahasiswa1 = new Mahasiswa();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa){
        mhs.add(mahasiswa);
        return mhs;
    }

    public static void tampilSemuaData(){
        // Gunakan perulangan
        // .....
        int n=1;
        for (Mahasiswa mahasiswa1 : mhs){
            System.out.println("==Tampilan Data Mahasiswa "+n+" Filkom UB==");
            System.out.println("Nama Mahasiswa : "+mahasiswa1.getNama());
            System.out.println("Jurusan        : "+mahasiswa1.getJurusan());
            String status;
            if (mahasiswa1.getStatus()){
                status = "Menikah";
            }
            else {
                status = "Lajang";
            }
            System.out.println("Status         : "+status);
            System.out.println();
            n++;
        }
    }

    public static Mahasiswa cariMahasiswa(String nama) {
        // Gunakan perulangan
        // .....
        for (Mahasiswa mahasiswa1 : mhs) {
            if (mahasiswa1.getNama().equals(nama)) {
                System.out.println("Data mahasiswa atas nama "+nama+" ditemukan");
                System.out.println();
                return mahasiswa1;
            }
        }
        System.out.println("Data mahasiswa atas nama "+nama+" tidak ditemukan");
        System.out.println();
        return null;
    }
    public static void tampilMahasiswa(Mahasiswa mahasiswa) {
        if (mahasiswa != null) {
            System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
            System.out.println("Jurusan        : " + mahasiswa.getJurusan());
            String status;
            if (mahasiswa.getStatus()){
                status = "Menikah";
            }
            else {
                status = "Lajang";
            }
            System.out.println("Status         : " + status);
            System.out.println();
        }
    }

    public static void updateMahasiswa(String nama, String namaBaru, String jurusanBaru, boolean statusBaru){
        // .....
        mahasiswa1 = cariMahasiswa(nama);
        if (mahasiswa1 != null) {
            mahasiswa1.setNama(namaBaru);
            mahasiswa1.setJurusan(jurusanBaru);
            mahasiswa1.setStatus(statusBaru);
            System.out.println("Data mahasiswa atas nama "+nama+" berhasil diupdate menjadi "+namaBaru);
            System.out.println();
        }
    }
}