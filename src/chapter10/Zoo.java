package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky); //Dog

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha); //Dog

        sasha = new Cat();
        sasha.makeSound(); //cat

        ((Cat) sasha).scratch();
        feed(sasha); //cat
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here is your food for Dog");
        } else if (animal instanceof Cat) {
            System.out.println("here is your food for Cat");
        }
    }
}
