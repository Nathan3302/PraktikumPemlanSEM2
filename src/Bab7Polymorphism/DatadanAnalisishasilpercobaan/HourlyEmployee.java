package Bab7Polymorphism.DatadanAnalisishasilpercobaan;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu
    public HourlyEmployee(String name, String noKTP, LocalDate tangalLahir, int jumlahBarang, double upahPerBarang, double hourlyWage, double hoursWorked) {
        super(name, noKTP, tangalLahir,jumlahBarang,upahPerBarang);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    public void setWage(double hourlyWage){
        wage = hourlyWage;
    }
    public double getWage(){
        return wage;
    }
    public void setHours(double hoursWorked){
        hours = hoursWorked;
    }
    public double getHours(){
        return hours;
    }
    public double earnings(){
        if(getHours()<=40)
            return super.earnings()+(getWage() * getHours());
        else
            return super.earnings()+(40 * getWage() + ( getHours()-40) * getWage() * 1.5);
    }

    @Override
    public double getMonthlySalary() {
        double monthlySalary = earnings()*4;
        if (isBirthday()){
            monthlySalary += 100000;
        }
        return monthlySalary;
    }

    public String toString(){
        return String.format("Hourly employee: "+super.toString()
                +"\nhourly wage"+getWage()+"\nhours worked: "+getHours());
    }
}
