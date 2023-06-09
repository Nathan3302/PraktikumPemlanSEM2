package Bab4Encapsulation.TugasPraktikum;

import java.util.Scanner;

public class SwalayanTiny {
    private double saldo = 0;
    private String nomorPelanggan, pin;
    private String nama, jenisRekening;
    boolean isAktif;
    Scanner input = new Scanner(System.in);

    public SwalayanTiny(String nama, String nomorPelanggan, double saldo, String pin){
        System.out.println("Berhasil");
        this.nama = nama;
        System.out.println("Nama UTP.Pelanggan: "+this.nama);
        int temp = nomorPelanggan.length();
        String temp2 = nomorPelanggan.substring(0,2);
        int temp3 = Integer.parseInt(temp2);
        if (temp == 10 && ((temp3 == 38) || (temp3 == 56) || (temp3==74))){
            this.nomorPelanggan = nomorPelanggan;
            System.out.println("Nomor UTP.Pelanggan: "+this.nomorPelanggan);
            if(temp3==38){
                this.jenisRekening = "silver";
                System.out.println("Jenis Rekening: "+this.jenisRekening);
            }
            else if (temp3==56) {
                this.jenisRekening = "gold";
                System.out.println("Jenis Rekening: "+this.jenisRekening);
            }
            else {
                this.jenisRekening="platinum";
                System.out.println("Jenis Rekening: "+this.jenisRekening);
            }
        }
        else {
            System.out.println("Nomor pelanggan Tn/Ny "+this.nama+ " tidak valid.");
        }

        if (saldo >= 10000){
            this.saldo = saldo;
            System.out.println("Saldo UTP.Pelanggan: "+this.saldo);
        }
        else {
            System.out.println("Saldo Tn/Ny "+this.nama+ " tidak mencukupi.");
        }

        int temp4 = pin.length();
        if (temp4 == 6){
            this.pin = pin;
        }
        else{
            System.out.println("Pin tidak valid");
        }
        isAktif = true;
    }

    public void setNomorPelanggan(String nomorPelanggan){
        System.out.println("====== Set No. UTP.Pelanggan ======");
        int temp = nomorPelanggan.length();
        String temp2 = nomorPelanggan.substring(0,2);
        int temp3 = Integer.parseInt(temp2);
        if (temp == 10 && ((temp3 == 38) || (temp3 == 56) || (temp3==74))){
            this.nomorPelanggan = nomorPelanggan;
            System.out.println("Nomor UTP.Pelanggan: "+this.nomorPelanggan);
            if(temp3==38){
                this.jenisRekening = "silver";
                System.out.println("Jenis Rekening: "+this.jenisRekening);
            }
            else if (temp3==56) {
                this.jenisRekening = "gold";
                System.out.println("Jenis Rekening: "+this.jenisRekening);
            }
            else {
                this.jenisRekening="platinum";
                System.out.println("Jenis Rekening: "+this.jenisRekening);
            }
        }
        else {
            System.out.println("Nomor pelanggan Tn/Ny "+this.nama+ " tidak valid.");
        }
    }

    public void setPin(String pin){
        System.out.println("====== Set Pin ======");
        int temp4 = pin.length();
        if (temp4 == 6){
            this.pin = pin;
            System.out.println("Pin berhasil ditambahkan");
        }
        else{
            System.out.println("Pin tidak valid");
        }
    }

    public void topupSaldo(double saldoTambah){
        System.out.println("====== Top Up Saldo ======");
        if(isAktif == true){
            String pinTemp = null;
            String noPelanggantemp = null;
            int salah;
            loopVerifikasi: for (salah = 0;salah<=2;salah++){
                System.out.print("Masukkan nomor pelanggan: ");noPelanggantemp = input.nextLine();
                System.out.print("Masukkan pin: ");pinTemp = input.nextLine();
                if (pinTemp.equals(this.pin)&&noPelanggantemp.equals(this.nomorPelanggan)){
                    salah = 0;
                    break loopVerifikasi;
                }
                System.out.println("Maaf, nomor pelanggan atau pin salah");
            }
            if(pinTemp.equals(this.pin)&&noPelanggantemp.equals(this.nomorPelanggan)) {
                this.saldo = this.saldo + saldoTambah;
                System.out.println("Berhasil Menambahkan Saldo");
                System.out.println("Total saldo anda adalah "+this.saldo);
            }
            else {
                isAktif = false;
                System.out.println("Maaf, akun anda akan dibekukan");
            }
        }
        else {
            System.out.println("Maaf, akun anda telah dibekukan\nHubungi admin untuk mengaktifkan");
        }
    }

    public void transaksi(double nominal){
        System.out.println("====== Transasksi ======");
        if (isAktif == true){
            String pinTemp = null;
            String noPelanggantemp=null;
            int salah;
            loopVerifikasi: for (salah = 0;salah<=2;salah++){
                System.out.print("Masukkan nomor pelanggan: ");noPelanggantemp = input.nextLine();
                System.out.print("Masukkan pin: ");pinTemp = input.nextLine();
                if (pinTemp.equals(this.pin)&&noPelanggantemp.equals(this.nomorPelanggan)){
                    salah = 0;
                    break loopVerifikasi;
                }
                System.out.println("Maaf, nomor pelanggan atau pin salah");
            }
            double cashback;
            if(pinTemp.equals(this.pin) && noPelanggantemp.equals(nomorPelanggan)) {
                if(this.saldo - nominal >= 10000){
                    if(this.jenisRekening.equals("silver")){
                        if(nominal>1000000){
                            cashback = 0.05 * nominal;
                            System.out.println("Selamat, transaksi anda berhasil");
                            System.out.println("Anda mendapatkan cashback sebesar "+cashback);
                            this.saldo = this.saldo - (nominal - cashback);
                            System.out.println("Sisa saldo anda sebesar "+this.saldo);
                        }
                        else {
                            System.out.println("Selamat, transaksi anda berhasil");
                            this.saldo = this.saldo - nominal;
                            System.out.println("Sisa saldo anda sebesar "+this.saldo);
                        }
                    }
                    else if (this.jenisRekening.equals("gold")) {
                        if(nominal>1000000){
                            cashback = 0.07 * nominal;
                            System.out.println("Selamat, transaksi anda berhasil");
                            System.out.println("Anda mendapatkan cashback sebesar "+cashback);
                            this.saldo = this.saldo - (nominal - cashback);
                            System.out.println("Sisa saldo anda sebesar "+this.saldo);
                        }
                        else {
                            cashback = 0.02 * nominal;
                            System.out.println("Selamat, transaksi anda berhasil");
                            System.out.println("Anda mendapatkan cashback sebesar "+cashback);
                            this.saldo = this.saldo - (nominal - cashback);
                            System.out.println("Sisa saldo anda sebesar "+this.saldo);
                        }
                    }
                    else if (this.jenisRekening.equals("platinum")) {
                        if(nominal>1000000){
                            cashback = 0.1 * nominal;
                            System.out.println("Selamat, transaksi anda berhasil");
                            System.out.println("Anda mendapatkan cashback sebesar "+cashback);
                            this.saldo = this.saldo - (nominal - cashback);
                            System.out.println("Sisa saldo anda sebesar "+this.saldo);
                        }
                        else {
                            cashback = 0.05 * nominal;
                            System.out.println("Selamat, transaksi anda berhasil");
                            System.out.println("Anda mendapatkan cashback sebesar "+cashback);
                            this.saldo = this.saldo - (nominal - cashback);
                            System.out.println("Sisa saldo anda sebesar "+this.saldo);
                        }
                    }
                }
                else{
                    System.out.println("Maaf, saldo anda tidak mencukupi");
                }
            }
            else {
                isAktif = false;
                System.out.println("Maaf, akun anda akan dibekukan");
            }
        }
        else {
            System.out.println("Maaf, akun anda telah dibekukan\nHubungi admin untuk mengaktifkan");
        }
    }
}


class TestSwalayanTiny{
    public static void main(String[] args) {
        SwalayanTiny cust1 = new SwalayanTiny("Adi","749453965",2000000, "6787102");
        cust1.setNomorPelanggan("7466889922");
        cust1.setPin("987654");
        cust1.topupSaldo(500000);
        cust1.transaksi(2490000);

        SwalayanTiny cust2 = new SwalayanTiny("Bambang","3876329076",500000,"785481");
        cust2.topupSaldo(50000);
        cust2.transaksi(1000000);
        cust2.topupSaldo(5000000);
        cust2.transaksi(500000);
        cust2.transaksi(1100000);
    }
}
