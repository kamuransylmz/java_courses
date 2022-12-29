package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overThePlan = 0.25;
    static int tax = 15;
/*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        scanner.close();

        double overageFees = calculateOverageFees(overageMinutes,planFee);
        double taxCalc = calculateTax(planFee,overageFees);
        calculateTotal(overageFees,taxCalc,planFee);

    }
    public static double calculateOverageFees(double overageMinutes, double planFee){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" +planFee);
        double overageCallPayment = overageMinutes * overThePlan;
        System.out.println("Overage: $" +overageCallPayment);
        return overageCallPayment;
    }
    public static double calculateTax(double overageFees ,double overageCallPayment){
        double taxPayment = ((overageFees + overageCallPayment) * tax)/100;
        System.out.println("Tax: $" + taxPayment);
        return taxPayment;
    }
    public static void calculateTotal(double overageFees , double taxCalc, double planFee){
        double totalPayment = planFee + overageFees + taxCalc;
        System.out.println("Total: $" +totalPayment);
    }

 */

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        scanner.close();
        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);
        calculateAndPrintBill(baseCost, overageCharge, tax);
    }
    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }
    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }
    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }

}
