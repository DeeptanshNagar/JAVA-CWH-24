package com.company;
import java.util.Scanner;

public class cwh_25_Ps5_ch5 {
    public static void main(String[] args) {

//        Program to print sum of first n even numbers using while loop.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of n");
//        int n = sc.nextInt();
//        int i=0;
//        int sum=0;
//        while(i<n){
//            sum = sum + 2*i;
//            i++;
//        }
//        System.out.println("Sum of first n even numbers is: " + sum);

//        Program to print sum of first n even numbers using for loop.
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the number n: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 0; i<n; i++){
//            sum = sum + 2*i;
//        }
//        System.out.println("The sum of first n even numbers is: " + sum);

//--------------------------------------------------------------------------------

//      WAP to print the multiplication table of given number n.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=10 ; i++){
//            System.out.format("%d x %d = %d\n", n , i , n*i);
//        }

//-----------------------------------------------------------------------------------------

//      Write a program to print multiplication table in reverse order.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        for(int i = 10; i>=1 ; i--) {
//            System.out.format("%d x %d = %d\n", n, i, n * i);
//        }
//------------------------------------------------------------------------------------------

//      Write a program to print the factorial of a given number using while loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial = factorial*i;
            i++;
        }
        System.out.println(factorial);

//      Write a program to print the factorial of a given number using for loop.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int factorial = 1;
//        for(int i = 1; i<=n; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);

//----------------------------------------------------------------------------------------------------------
//      Question 1 using while loop.    //vanshika's program.

//        int i = 4;
//        while(i!=0){
//            int j = i;
//            while(j!=0){
//                System.out.print("*");;
//                j--;
//            }
//            System.out.println();
//            i--;
//        }

//----------------------------------------------------------------------------------------------------------------

//      Write a program to add numbers occuring in multiplication table of 8.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i<=10 ; i++){
//            sum = sum + n*i;
//        }
//        System.out.println(sum);










    }

}
