package latihanSoaldanPengayaan.no1;

public class main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Layla");
        Enemy enemy1 = new Enemy("Gord");
        System.out.println("=====Static Polymorphism=====");
        hero1.move();
        hero1.move("depan");
        enemy1.move();
        enemy1.move(6);
        System.out.println("============================");
        System.out.println("=====Dynamic Polymorphism=====");
        Character char1 = new Hero("Lukaku");
        Character char2 = new Fighter("Zilong");
        Character char3 = new Enemy("Minion");
        Character char4 = new Witch("Nana");
        Character char6 = new Fighter("Z");
        char1.move();
        char2.move();
        char3.move();
        char4.move();
        System.out.println("=============================");
        System.out.println("=====Dynamic Polymorphism 2=====");
        Character char5 = new Witch("WKWK");
        char5.move();
        char5 = (Fighter) char6;
        char5.move();

        System.out.println("==================================");
    }
}
