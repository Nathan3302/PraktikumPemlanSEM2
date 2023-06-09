package Bab7Polymorphism.DatadanAnalisishasilpercobaan;

import java.time.LocalDate;

public class Commission extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi
    public Commission(String name, String noKTP, LocalDate birthdate, int jumlahBarang, double upahPerBarang, double grossSales, double rate){
        super(name, noKTP,birthdate,jumlahBarang,upahPerBarang);
        setGrossSales(grossSales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales){
        grossSales = sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double rate){
        commissionRate = rate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return super.earnings()+(getCommissionRate()*getGrossSales());
    }

    @Override
    public double getMonthlySalary() {
        double monthlySalary = earnings() * 4;
        if (isBirthday()){
            monthlySalary += 100000;
        }
        return monthlySalary;
    }
    public String toString(){
        return String.format("Commision employee: "+super.toString()+"\ngross sales: "+getGrossSales()+"\ncommission rate"+getCommissionRate());
    }
}
