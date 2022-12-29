package chapter6;

public class PhoneBillCalculatorRedo {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    public PhoneBillCalculatorRedo(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    public PhoneBillCalculatorRedo(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    public PhoneBillCalculatorRedo(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    public int getID() {
        return id;
    }
    public void setID(int ID) {
        this.id = ID;
    }
    public double getBaseCost() {
        return baseCost;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    public int getNumberOfAllottedMinutes() {
        return allottedMinutes;
    }
    public void setNumberOfAllottedMinutes(int numberOfAllottedMinutes) {
        this.allottedMinutes = numberOfAllottedMinutes;
    }
    public int getNumberOfMinutesUsed() {
        return minutesUsed;
    }
    public void setNumberOfMinutesUsed(int numberOfMinutesUsed) {
        this.minutesUsed = numberOfMinutesUsed;
    }

    public double calculateOverage(){
        if (minutesUsed <= allottedMinutes){
            return  0;
        }
        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }
    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }
    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }
    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}
