package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter a Year : ");
        Scanner sc =new Scanner(System.in);
        year = sc.nextInt();
        if ( ( year%4 == 0 && year%100 != 0 ) || year%400 == 0 ) {
            System.out.println("Enter year is Leap Year");
        }
        else {
            System.out.println("Enter year is not Leap Year");
        }
    }
}
