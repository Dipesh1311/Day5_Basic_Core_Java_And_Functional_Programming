package com.bridgelabz.basiccore;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("Entered number is Even");
        }
        else {
            System.out.println("Entered number is Odd");
        }
    }
}
