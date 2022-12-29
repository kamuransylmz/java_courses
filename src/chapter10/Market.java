package chapter10;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();
        squeeze(apple);

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.peel();
        squeeze(banana);

        Fruit banana2 = new Banana();
        ((Banana) banana2).peel();
        squeeze(banana2);

        Fruit orange = new Fruit();
        squeeze(orange);

    }
    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
