package com.bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        float divisor, dividend, quotient, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a Dividend : ");
        dividend = sc.nextFloat();
        System.out.print("Please enter a Divisor : ");
        divisor = sc.nextFloat();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient is : " + quotient);
        System.out.println("Remainder is : " + remainder);
    }
}
