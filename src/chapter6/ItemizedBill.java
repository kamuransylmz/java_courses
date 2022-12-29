package chapter6;

import java.util.Scanner;

public class ItemizedBill {

    public static void main(String[] args) {

        PhoneBillCalculatorRedo phoneBillCalculator = new PhoneBillCalculatorRedo();
        phoneBillCalculator.setNumberOfMinutesUsed(1000);
        phoneBillCalculator.printItemizedBill();

    }
}
