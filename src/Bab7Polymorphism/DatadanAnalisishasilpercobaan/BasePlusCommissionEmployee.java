package Bab7Polymorphism.DatadanAnalisishasilpercobaan;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends Commission {
    private double baseSalary;//gaji pokok tiap minggu
    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate birthdate, int jumlahBarang, double upahPerBarang, double sales, double rate, double salary) {
        super(name, noKTP,birthdate, jumlahBarang, upahPerBarang, sales, rate);
        setBaseSalary(salary);
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public double getMonthlySalary() {
        double monthlySalary = earnings() * 4;
        if (isBirthday()){
            monthlySalary += 100000;
        }
        return monthlySalary;
    }
    public String toString() {
        return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
    }
}
