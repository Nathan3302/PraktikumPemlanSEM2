package latihanSoaldanPengayaan.no1;

public class Hero extends Character {
    public Hero (String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Karakter Hero "+super.name+" Bergerak");
    }

    public void move(String direction){
        System.out.println("Karakter Hero "+super.name+" Bergerak ke Arah "+direction);
    }
}
