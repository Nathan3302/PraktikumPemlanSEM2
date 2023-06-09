package Bab7Polymorphism.DatadanAnalisishasilpercobaan;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate birthdate;
    protected int jumlahBarang;
    protected double upahPerBarang;
    public Employee(String name, String noKTP, LocalDate birthdate,int jumlahBarang, double upahPerBarang){
        this.name = name;
        this.noKTP = noKTP;
        this.birthdate = birthdate;
        this.jumlahBarang=jumlahBarang;
        this.upahPerBarang=upahPerBarang;
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }

    public void setTanggalLahir(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP()+"\nTanggal Lahir: "+getBirthdate());
    }
    public double earnings(){
        return jumlahBarang*upahPerBarang;
    };//pendapatan
    public abstract double getMonthlySalary();

    public boolean isBirthday() {
        LocalDate currentDate = LocalDate.now();
        return birthdate.getMonth() == currentDate.getMonth();
    }
}
