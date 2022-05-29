package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is Largest");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is Largest");
        }
        else {
            System.out.println(num3 + " is Largest");
        }
    }
}
