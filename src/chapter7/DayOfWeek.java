package chapter7;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        String[] week = {"monday","tuesday","wednesday","thursday", "friday", "saturday","sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int index = input.nextInt();
        input.close();

        System.out.println("Corresponding day: " + week[index - 1]);
    }
}
