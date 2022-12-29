package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {



/*
    public static void main(String[] args) {

        int dollar = 1;
        double pennies = 0.01 * dollar;
        double nickels = 0.05 * dollar;
        double dimes = 0.1 * dollar;
        double quarters = 0.25 * dollar;

        System.out.println("Enter pennies:");
        Scanner scanner1 = new Scanner(System.in);
       double numberOFpennies =  scanner1.nextDouble();

        System.out.println("Enter nickels:");
        Scanner scanner2 = new Scanner(System.in);
        double numberOFnickels =  scanner2.nextDouble();

        System.out.println("Enter dimes:");
        Scanner scanner3 = new Scanner(System.in);
        double numberOFdimes =  scanner2.nextDouble();

        System.out.println("Enter quarters:");
        Scanner scanner4 = new Scanner(System.in);
        double numberOFquarters =  scanner2.nextDouble();

        double sum = pennies * numberOFpennies + nickels * numberOFnickels +
                dimes * numberOFdimes + quarters * numberOFquarters;
        if (sum == dollar){
            System.out.println("Congrats you win! " + sum);
        }else {
            System.out.println("Try again " + sum);
        }
    }

 */

    /*
    public static void main(String[] args){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }

     */
    public static void main(String[] args) {

        double penny, nickel, dime, quarter, dollars, result;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many pennies do you have?");
        penny = scan.nextDouble();

        System.out.println("How many nickels do you have?");
        nickel = scan.nextDouble();

        System.out.println("How many dimes do you have?");
        dime = scan.nextDouble();

        System.out.println("How many quarters do you have?");
        quarter = scan.nextDouble();

        result = (0.25 * quarter) + (0.10 * dime)
                + (0.05 * nickel) + (0.01 * penny);
        dollars = 1;

        System.out.println("The total is: " + result);

        if(result>dollars) {
            System.out.println("You are over by " + (result-dollars));

        } else if(dollars>result) {
            System.out.println("You are short by " + (dollars-result));
        } else {

            System.out.println("You are the winner!");
        }

    }
}
