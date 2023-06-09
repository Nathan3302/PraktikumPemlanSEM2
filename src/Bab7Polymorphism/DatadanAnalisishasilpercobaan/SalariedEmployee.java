package Bab7Polymorphism.DatadanAnalisishasilpercobaan;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, LocalDate birthdate,int jumlahBarang, double upahPerBarang, double salary) {
        super(name, noKTP,birthdate,jumlahBarang,upahPerBarang);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return super.earnings()+ getWeeklySalary();
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
        return String.format("Salaried employee: " + super.toString() +
                "\nweekly salary:" + getWeeklySalary());
    }
}
