package latihanSoaldanPengayaan.no1;

public class Enemy extends Character {
    public Enemy(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Karakter Enemy "+super.name+" Bergerak");
    }

    public void move(int step){
        System.out.println("Karakter Enemy "+super.name+" bergerak sejauh "+step+" langkah");
    }
}
