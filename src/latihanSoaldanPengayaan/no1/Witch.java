package latihanSoaldanPengayaan.no1;

public class Witch extends Enemy{

    public Witch(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Karakter Witch "+super.name+" Bergerak");
    }
}
