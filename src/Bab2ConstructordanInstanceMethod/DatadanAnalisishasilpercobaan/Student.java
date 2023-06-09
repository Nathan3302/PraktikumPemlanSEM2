package Bab2ConstructordanInstanceMethod.DatadanAnalisishasilpercobaan;

import java.util.Scanner;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    static private int hitungObjek;
    public Student(){
        name = "";
        address = "";
        age = 0;
        this.hitungObjek++;
    }
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        this.hitungObjek++;
    }
    public Student(double mathGrade, double englishGrade, double scienceGrade){
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        this.hitungObjek++;
    }
    public void setName(String n){

        name = n;
    }
    public void setAddress(String a){

        address = a;
    }
    public void setAge(int ag){

        age = ag;
    }
    public void setMath(double math){

        mathGrade = math;
    }
    public void setEnglish(double english){

        englishGrade = english;
    }
    public void setScience(double science){

        scienceGrade = science;
    }
    private double getAverage(){
        double result = 0;
        result = (this.mathGrade+this.scienceGrade+this.englishGrade)/3;
        this.average = result;
        return result;
    }
    boolean statusAkhir(){
        if (this.average > 60){
            return true;
        }
        else{
            return false;
        }
    }

    static void jumlahObjek(){
        System.out.println("Jumlah Objek adalah "+hitungObjek);
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        System.out.println("Status Kelulusannya adalah "+statusAkhir());
        System.out.println("True adalah lulus, false adalah remidi");
    }
}

class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
//menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri",
                21); chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();
        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();
//siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        Student budi = new Student(90,87,99);
        budi.setName("budi");
        budi.displayMessage();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int numStudents = input.nextInt();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Masukkan informasi siswa ke-" + (i+1) + ":");
            System.out.print("Nama: ");
            String name = input.next();
            input.nextLine();
            System.out.print("Alamat: ");
            String address = input.nextLine();
            System.out.print("Umur: ");
            int age = input.nextInt();
            System.out.print("Nilai Matematika: ");
            double mathGrade = input.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double englishGrade = input.nextDouble();
            System.out.print("Nilai Sains: ");
            double scienceGrade = input.nextDouble();

            students[i] = new Student(name, address, age);
            students[i].setMath((int) mathGrade);
            students[i].setEnglish((int) englishGrade);
            students[i].setScience(scienceGrade);
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Informasi siswa ke-" + (i+1) + ":");
            students[i].displayMessage();
        }

        Student.jumlahObjek();
    }
}