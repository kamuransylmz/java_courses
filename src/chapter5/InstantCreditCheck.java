package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);
    static  int requiredSalary = 25000;
    static  int requiredCreditScore = 700;

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(creditScore,salary);
        notifyUser(qualified);
    }
    public static double getSalary(){
        System.out.println("Enter your credit salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int credit = scanner.nextInt();
        return credit;
    }

    public static boolean isUserQualified(int creditScore,double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("You approved");
        }else {
            System.out.println("you dont");
        }
    }
}
