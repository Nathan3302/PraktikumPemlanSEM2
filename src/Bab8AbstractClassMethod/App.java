package Bab8AbstractClassMethod;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car(new Owner("Arsyad"),"Toyota GR Yaris",2022,6500.0);
        Car car2 = new Car(new Owner("Ardhan"),"Jeep Wrangler",1972,6000.0);
        Car car3 = new Car(new Owner("Budhi"),"Mazda RX 87",1967,10500.0);
        Car car4 = new Car(new Owner("Galuh"),"Mercedes Benz 220",1958,5500.0);
        // todo...
        car1.status();
        car2.status();
        car3.status();
        car4.status();
    }
}
