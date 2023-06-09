package latihanSoaldanPengayaan.no1;

public class Character {
    protected String name;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Karakter "+name+" Bergerak");
    }

    public void setName(String name) {
        this.name = name;
    }
}
