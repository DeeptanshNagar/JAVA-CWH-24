package com.company;
import java.util.Scanner;

public class ExQues_boardPercentCalculator {
    public static void main(String[] args){
        System.out.println("---BOARD EXAM PERCENTAGE CALCULATOR---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Physics: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number of Mathematics: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number of Chemistry: ");
        int num3 = sc.nextInt();
        System.out.println("Enter the number of English: ");
        int num4 = sc.nextInt();
        System.out.println("Enter the number of Java: ");
        int num5 = sc.nextInt();

        float percentage = ((num1 + num2 + num3 + num4 + num5)/500.0f)*100;

        System.out.println("Congratulations! You got " + percentage + " % in you board exam.");

    }
}
