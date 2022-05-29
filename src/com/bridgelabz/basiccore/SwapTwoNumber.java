package com.bridgelabz.basiccore;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Before Swapping -----");
        System.out.print("First Number : ");
        firstNumber = sc.nextInt();
        System.out.print("Second Number : ");
        secondNumber = sc.nextInt();

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("----- After Swapping ------");
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
    }
}
