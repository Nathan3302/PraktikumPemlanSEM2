package Bab7Polymorphism.TugasPraktikum;

public class main {
    public static void main(String[] args) {
        Kue ArrayKue[] = new Kue[20];
        ArrayKue[0]=new KueJadi("kue1",10000,2 );
        ArrayKue[1]=new KueJadi("kue2", 32500,4);
        ArrayKue[2]=new KueJadi("kue3", 8000,5);
        ArrayKue[3]=new KueJadi("kue4", 12000,4);
        ArrayKue[4]=new KueJadi("kue5",10000,4);
        ArrayKue[5]=new KueJadi("kue6", 15000,10);
        ArrayKue[6]=new KueJadi("kue7", 5000,2);
        ArrayKue[7]=new KueJadi("kue8", 35000,1);
        ArrayKue[8]=new KueJadi("kue9", 4500,3);
        ArrayKue[9]=new KueJadi("kue10", 2000,6);
        ArrayKue[10]=new KuePesanan("kue11", 3000, 4);
        ArrayKue[11]=new KuePesanan("kue12", 10500, 2.5);
        ArrayKue[12]=new KuePesanan("kue13", 7200, 3.7);
        ArrayKue[13]=new KuePesanan("kue14", 5500, 7.2);
        ArrayKue[14]=new KuePesanan("kue15", 2500,4.4);
        ArrayKue[15]=new KuePesanan("kue16", 22000, 1.9);
        ArrayKue[16]=new KuePesanan("kue17", 3200, 1.1);
        ArrayKue[17]=new KuePesanan("kue18", 5700, 6.7);
        ArrayKue[18]=new KuePesanan("kue19", 1800, 3.2);
        ArrayKue[19]=new KuePesanan("kue20", 2800,2.4);

        double totalHargaKueJadi = 0, totalHargaKuePesanan = 0, totalHarga = 0, totalBerat = 0, totalJumlah = 0, hargaTertinggi = 0;
        Kue kueTertinggi = null;

        //Menampilkan kue dan jenis kue nya
        for(int i = 0;i<20;i++){
            System.out.println(ArrayKue[i].toString());
            totalHarga += ArrayKue[i].hitungHarga();
            if (ArrayKue[i] instanceof KueJadi){
                System.out.println("Jenis Kue: Kue Jadi"+"\n");
                totalHargaKueJadi += ArrayKue[i].hitungHarga();
                totalJumlah += ((KueJadi) ArrayKue[i]).getJumlah();
            } else if (ArrayKue[i] instanceof KuePesanan) {
                System.out.println("Jenis Kue: Kue Pesanan"+"\n");
                totalHargaKuePesanan += ArrayKue[i].hitungHarga();
                totalBerat += ((KuePesanan) ArrayKue[i]).getBerat();
            }
            if (ArrayKue[i].hitungHarga() > hargaTertinggi){
                hargaTertinggi = ArrayKue[i].hitungHarga();
                kueTertinggi = ArrayKue[i];
            }
        }
        System.out.println("Total Harga dari semua jenis kue: "+totalHarga);
        System.out.println("Total Harga Kue Pesanan: "+totalHargaKuePesanan+", Total Berat: "+totalBerat);
        System.out.println("Total Harga Kue Jadi: "+totalHargaKueJadi+", Total Jumlah: "+totalJumlah);
        System.out.println("Kue dengan harga akhir terbesar adalah "+kueTertinggi.getNama()+" dengan harga akhir sebesar "+hargaTertinggi);



    }
}
