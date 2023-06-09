package Bab7Polymorphism.DatadanAnalisishasilpercobaan;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", LocalDate.of(2001,1,1), 12, 1000,800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", LocalDate.of(2002,2,2), 5, 150,16.75, 40);
        Commission commissionEmployee = new Commission("Keanu", "145", LocalDate.of(2001,5,10), 3, 100, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", LocalDate.of(2001,5,12),2, 80, 5000, .04, 300);
        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n",
                salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf(
                        "Gaji pokok setelah dinaikkan 10%% : $%,.2f\n",
                        employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }

        System.out.println("\nJawaban no.4");
        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            if (currentEmployee.isBirthday()){
                System.out.println("Monthly Salary + Birthday Bonus: "+currentEmployee.getMonthlySalary());
            }
            else {
                System.out.println("Monthly Salary: "+currentEmployee.getMonthlySalary());
            }
            System.out.println();

            System.out.println("Jawaban no.5");
            HourlyEmployee emp1 = new HourlyEmployee("surti","123",LocalDate.of(2000,3,27),5,20,200.0,6);
            SalariedEmployee emp2 = new SalariedEmployee("Tejo","23890",LocalDate.of(1999,5,13),9,150,2000);
            Commission emp3 = new Commission("sumo","20984",LocalDate.of(2001,4,20),21,100,50.0,5.2);
            BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee("wiw","29804",LocalDate.of(2004,5,10),7,85,2000,6,275);
            System.out.println(emp1.toString()+"\n"+emp1.getMonthlySalary()+"\n");
            System.out.println(emp2.toString()+"\n"+emp2.getMonthlySalary()+"\n");
            System.out.println(emp3.toString()+"\n"+emp3.getMonthlySalary()+"\n");
            System.out.println(emp4.toString()+"\n"+emp4.getMonthlySalary()+"\n");
        }
    }
}
