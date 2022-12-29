package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.setName("Glenda");

        System.out.println(mother.getName() + " is a " + mother.getGender());

        /*
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square!");

        //Person person = new Person();
        //person.setAge(18);
        //person.setName("Angie");
        //Employee employee = new Employee();
        //employee.setName("Angie Inheritance");
        //employee.setTitle("subclass");

         */
    }
}
