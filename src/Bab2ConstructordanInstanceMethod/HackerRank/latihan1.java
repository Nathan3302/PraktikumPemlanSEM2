package Bab2ConstructordanInstanceMethod.HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Manusia{
    String nama;
    int jumlah;

    Manusia(int jumlah){
        this.nama = nama;
        this.jumlah = jumlah;
    }

    void jualBeli(Buah buah){
        buah.sisaBuah(this.jumlah);
    }
}

class Buah{
    String nama;
    int jumlahBuah;

    Buah (String nama, int jumlahBuah){
        this.nama=nama;
        this.jumlahBuah = jumlahBuah;
    }

    void sisaBuah (int jumlah){
        if (this.jumlahBuah ==0 || jumlah ==0 ) {
            System.out.println("NA");

        }
        else if (jumlah > this.jumlahBuah){
            System.out.println("Gagal checkout buah");
        }
        else {
            this.jumlahBuah = (this.jumlahBuah - jumlah);
            System.out.println("Berhasil checkout buah");
            System.out.println("Sisa buah = "+this.jumlahBuah);

        }
    }
}

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBuah = input.nextLine();
        int jumlahBuah = input.nextInt();
        int jumlah = input.nextInt();


        Manusia man1 = new Manusia(jumlah);
        Buah buah1 = new Buah(namaBuah, jumlahBuah);

        man1.jualBeli(buah1);
    }
}