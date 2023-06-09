package Bab5Inheritance.TugasPraktikum;

import java.time.LocalDate;

public class MainManusia {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Adi","234345",true,true);
        System.out.println(man1);
        Manusia man2 = new Manusia("Lili","093854038549",false,true);
        System.out.println(man2);
        Manusia man3 = new Manusia("Joko","9834904",true,false);
        System.out.println(man3);
        MahasiswaFIILKOM mhs1 = new MahasiswaFIILKOM("nathan","312312312",true,false,"225150400111049",2.5);
        System.out.println(mhs1);
        MahasiswaFIILKOM mhs2 = new MahasiswaFIILKOM("nathan","312312312",true,false,"225150400111049",3.45);
        System.out.println(mhs2);
        MahasiswaFIILKOM mhs3 = new MahasiswaFIILKOM("nathan","312312312",true,false,"225150400111049",3.93);
        System.out.println(mhs3);
        Pekerja pkj1 = new Pekerja("Yusi","304958",true,true,5000, LocalDate.of(2021,2,21),2);
        System.out.println(pkj1);
        Pekerja pkj2 = new Pekerja("Bayu", "398457",true,false,8000,LocalDate.of(2014,3,17),0);
        System.out.println(pkj2);
        Pekerja pkj3 = new Pekerja("Lutfi","38495",true,true,8900,LocalDate.of(2003, 1,7),10);
        System.out.println(pkj3);
        Manager mnj1 = new Manager("Rudi","304958",true,true,7500,LocalDate.of(2008,4,2),1,"HRD");
        System.out.println(mnj1);
    }
}
