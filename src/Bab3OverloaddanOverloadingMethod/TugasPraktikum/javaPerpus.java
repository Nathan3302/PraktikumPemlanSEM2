package Bab3OverloaddanOverloadingMethod.TugasPraktikum;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Perpus {

    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private int jmlPenjualanSebulan;
    private String sinopsis = null;

    private String[] penulisbanyak = new String[0];

    public Perpus() {

    }

    public Perpus(String kategori, String penulis, String judul, String bahasa, String penerbitan, String edisi, int halaman, String sinopsis) {
        this.kategori = kategori;
        this.penulis = penulis;
        this.judul = judul;
        this.bahasa = bahasa;
        this.penerbitan = penerbitan;
        this.edisi = edisi;
        this.halaman = halaman;
        this.sinopsis = sinopsis;
    }

    public Perpus(String kategori, String[] penulisbanyak, String judul, String bahasa, String penerbitan, String edisi, int halaman, String sinopsis) {
        this.kategori = kategori;
        this.judul = judul;
        this.bahasa = bahasa;
        this.penerbitan = penerbitan;
        this.edisi = edisi;
        this.halaman = halaman;
        this.sinopsis = sinopsis;
        this.penulisbanyak = penulisbanyak;
    }
    public void setJmlPenjualanSebulan(int a){
        this.jmlPenjualanSebulan = a;
    }

    public int getJmlPenjualanSebulan(){
        return jmlPenjualanSebulan;
    }

    public String[] getpenulisbanyak() {

        return penulisbanyak;
    }

    public void setPenulisbanyak(String[] s) {

        this.penulisbanyak = s;
    }

    public void setKategori(String s) {

        kategori = s;
    }

    public void setPenulis(String s) {

        penulis = s;
    }

    public String getPenulis(){
        return penulis;
    }

    public void setJudul(String s) {

        judul = s;
    }

    public void setPenerbitan(String s) {

        penerbitan = s;
    }

    public void setEdisi(String i) {

        edisi = i;
    }

    public void setHalaman(int i) {

        halaman = i;
    }

    public void setBahasa(String s) {

        bahasa = s;
    }

    public void setSinopsis(String sinopsis) {
        int count = sinopsis.split("\\s+").length; // split synopsis by whitespace and count the number of words
        if (count >= 10) {
            this.sinopsis = sinopsis;
        } else {
            System.out.println("Synopsis should have at least 10 words.");
        }
    }

    public int countSinopsis() {
        if (this.sinopsis == null) {
            return 0;
        } else {
            String[] words = this.sinopsis.split("\\s+");
            return words.length;
        }
    }

    public double persentaseKesamaan(Perpus perpus) {
        double jumlahAtribut = 8;
        double jumlahKesamaan = 0;
        if (this.kategori.equals(perpus.kategori)) {
            jumlahKesamaan++;
        }

        if (this.penulis != null && perpus.penulis != null && (this.penulis.equals(perpus.penulis))) {
            jumlahKesamaan++;
        } else if (Arrays.equals(this.penulisbanyak, perpus.penulisbanyak)) {
            jumlahKesamaan++;
        }
        if (this.judul.equals(perpus.judul)) {
            jumlahKesamaan++;
        }
        if (this.bahasa.equals(perpus.bahasa)) {
            jumlahKesamaan++;
        }

        if (this.penerbitan.equals(perpus.penerbitan)) {
            jumlahKesamaan++;
        }
        if (this.edisi.equals(perpus.edisi)) {
            jumlahKesamaan++;
        }
        if (this.halaman == perpus.halaman) {
            jumlahKesamaan++;
        }
        if (this.sinopsis != null && perpus.sinopsis != null && this.sinopsis.equals(perpus.sinopsis)) {
            jumlahKesamaan++;
        }

        double persentase = (jumlahKesamaan / jumlahAtribut) * 100.00;
        return persentase;
    }

    public Perpus copy() {
        Perpus perpusCopy;
        if (this.penulis != null) {
            perpusCopy = new Perpus(this.kategori, this.penulis, this.judul, this.bahasa, this.penerbitan, this.edisi, this.halaman, this.sinopsis);
        } else {
            perpusCopy = new Perpus(this.kategori, this.penulisbanyak, this.judul, this.bahasa, this.penerbitan, this.edisi, this.halaman, this.sinopsis);
        }
        return perpusCopy;
    }

    public void hitungRoyalti(double harga){
        double royalti = jmlPenjualanSebulan * harga * 0.1;
        System.out.println("Royalti dari buku "+judul+": "+royalti);
    }

    public void hitungRoyalti(double harga, double percent){
        double royalti = jmlPenjualanSebulan * harga * (percent/100);
        System.out.println("Royalti dari buku "+judul+": "+royalti);
    }

    public void bacaFile(String pathFile){
        try {
            File aksesTxt = new File(pathFile);
            Scanner inputBuku = new Scanner(aksesTxt);
            String isiFile = inputBuku.nextLine();
            String[] nilai = isiFile.split(";");

            this.judul = nilai[0].trim();
            this.penulis = nilai[1].trim();

            inputBuku.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
            e.printStackTrace();
        }
    }

    public void simpanBuku(String namaFile){
        try {
            FileWriter writer = new FileWriter(namaFile);
            writer.write("Informasi latihanSoaldanPengayaan.no2.Buku:\n");
            writer.write("Kategori: "+this.kategori + "\n");
            if(this.penulis!=null) {
                writer.write("Penulis: " + this.penulis + "\n");
            }
            else{
                writer.write("Penulis: " + Arrays.toString(this.penulisbanyak).replace("[","").replace("]","") + "\n");
            }
            writer.write("Judul: " + this.judul + "\n");
            writer.write("Bahasa: " + this.bahasa + "\n");
            writer.write("Penerbit: " + this.penerbitan + "\n");
            writer.write("Edisi: " + this.edisi + "\n");
            writer.write("Halaman: " + this.halaman + "\n");
            writer.write("Sinopsis: " + this.sinopsis + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

    }


    public void displayMessage () {
        System.out.println(judul);
        System.out.println("Informasi latihanSoaldanPengayaan.no2.Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulis != null) {
            System.out.println("Penulis : " + penulis);
        }
        else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]", ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis: " + countSinopsis());
    }
}

public class javaPerpus {
    public static void main(String[] args) {
        Perpus b1 = new Perpus();
        b1.setJudul("A History of science technology and philosophy in the eighteenth century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbitan("LondonGeorge Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.displayMessage();
        System.out.println("=====================================");

        Perpus b2 = new Perpus();
        b2.setJudul("Information and Communication Technology,dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setPenulisbanyak(new String[]{"Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa", "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan", "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah", "Sri Budi Lestari", "Edi antoso", "M as’Amah"});
        b2.setPenerbitan("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setHalaman(178);
        b2.displayMessage();
        System.out.println("=====================================");

        Perpus b3 = new Perpus();
        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbitan("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.displayMessage();
        System.out.println("=====================================");

        Perpus b4 = new Perpus();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbitan("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.displayMessage();
        System.out.println("=====================================");

        Perpus b5 = new Perpus();
        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbitan("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.displayMessage();
        System.out.println("=====================================");

        Perpus b6 = new Perpus();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbitan("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.displayMessage();
        System.out.println("=====================================");

        Perpus b7 = new Perpus();
        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbitan("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);
        b7.displayMessage();
        System.out.println("=====================================");

        Perpus b8 = new Perpus();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbitan("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.displayMessage();
        System.out.println("=====================================");

        Perpus b9 = new Perpus();
        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbitan("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.displayMessage();
        System.out.println("=====================================");

        Perpus b10 = new Perpus();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbitan("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.displayMessage();
        System.out.println("=====================================");

        Perpus b11 = new Perpus();
        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbitan("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.displayMessage();
        System.out.println("=====================================");

        Perpus b12 = new Perpus();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbitan("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.displayMessage();
        System.out.println("=====================================");

        Perpus b13 = new Perpus();
        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbitan("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.setSinopsis("Contoh tes sinopsis");
        b13.displayMessage();
        System.out.println("=====================================");

        Perpus b14 = new Perpus();
        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbitan("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.setSinopsis("Dendam adalah hal yang harus dibalaskan sehingga jangan kau pendam sendirian");
        b14.displayMessage();
        System.out.println("=====================================");

        Perpus b15 = new Perpus("Fiksi", new String[]{"Ayah", "Ibu"}, "Tes konstruktor", "Indonesia", "Gramedia", "2", 105, "ini adalah hanya tes dengan minimum 10 kata ya semua");
        b15.displayMessage();
        System.out.println("=====================================");

        Perpus b16 = new Perpus("Fiksi", new String[]{"Ayah", "Ibu", "Anak"}, "Judul lain", "Indonesia", "Gramedia", "5", 105, "ini adalah hanya tes dengan minimum 10 kata ya semua");
        b16.displayMessage();
        System.out.println("=====================================");

        System.out.println("Persentase Kesamaaan buku 15 dengan 16 adalah "+b16.persentaseKesamaan(b15)+"%");

        Perpus b17 = new Perpus("Fiksi", new String[]{"Ayah", "Ibu"}, "Tes konstruktor", "Indonesia", "Gramedia", "2", 105, "ini adalah hanya tes dengan minimum 10 kata ya semua");
        b15.displayMessage();
        System.out.println("=====================================");

        System.out.println(b15.persentaseKesamaan(b17)+"%");

        System.out.println("=====================================");

        Perpus b18 = b1.copy();
        b18.displayMessage();
        b18.setJmlPenjualanSebulan(20);
        b18.hitungRoyalti(30000);
        b18.hitungRoyalti(25000,15);

        System.out.println("=====================================");

        Perpus b19 = new Perpus();
        b19.bacaFile("filebuku.txt");
        b19.displayMessage();
        b17.simpanBuku("filebuku1.txt");

    }
}
