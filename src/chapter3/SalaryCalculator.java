package chapter3;

import java.util.Scanner;

/*
if statement
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //Initialize known value
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Gey values for the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour the bonus earners
        if (sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
