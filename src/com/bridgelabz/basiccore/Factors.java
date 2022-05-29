package com.bridgelabz.basiccore;

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to find out the prime factors : ");
        number = sc.nextInt();
        for (int index = 2; index * index <= number; index++) {
            if (number % index == 0) {
                System.out.println(index + " ");
                number = number / index;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
}
