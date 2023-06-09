package Bab8AbstractClassMethod;

public class Car extends Vehicle {
    // buat variabel owner yang bertipe data Owner
    // .....
    Owner owner;

    Car(Owner o, String name, int year, double rpm) {
        // todo...
        owner = o;
        this.name = name;
        this.year = year;
        this.rpm = rpm;
    }

    @Override
    public void status() {
        System.out.println("Car name\t: " + this.name);
        System.out.println("Car owner\t: " + this.owner.getName());
        System.out.println("Output year\t: " + this.year);
        System.out.println("RPM\t\t\t: " + this.rpm);
        System.out.println();
    }
}
