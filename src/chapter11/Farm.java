package chapter11;

public class Farm {
    public static void main(String[] args) {

        Animal duck = new Duck();
        System.out.println(duck.makeSound());
        duck.eat();

        Animal pig = new Pig();
        System.out.println(pig.makeSound());
        pig.eat();

        Duck donald = new Duck();
        donald.makeSound();

        Pig porky = new Pig();
        porky.makeSound();
    }
}
