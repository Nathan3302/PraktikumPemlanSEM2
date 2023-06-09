package latihanSoaldanPengayaan.no1;

public class Fighter extends Hero{
    public Fighter(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Karakter Fighter "+super.name+" Bergerak");
    }

}
