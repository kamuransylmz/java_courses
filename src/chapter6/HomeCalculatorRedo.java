package chapter6;

import java.util.Scanner;

public class HomeCalculatorRedo {
     private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeCalculatorRedo calculatorRedo = new HomeCalculatorRedo();
        Rectangle kitchen = calculatorRedo.getRoom();
        Rectangle bathroom = calculatorRedo.getRoom();

        double area = calculatorRedo.calculateTotalArea(kitchen,bathroom);
        System.out.println("Total area: " +area);

        calculatorRedo.scanner.close();

    }
    public Rectangle getRoom(){
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
