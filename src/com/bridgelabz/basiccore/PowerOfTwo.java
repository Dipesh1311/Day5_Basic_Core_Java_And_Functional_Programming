package com.bridgelabz.basiccore;

import java.util.Scanner;


public class PowerOfTwo {
    public static void main(String[] args) {
        int power,powOfTwo;

        System.out.print("Enter a power : ");
        Scanner sc =new Scanner(System.in);
        power = sc.nextInt();
        if (0<=power && power<31) {

            for (int i=1;i<power;i++) {
                 powOfTwo = (int) Math.pow(2, i);
                System.out.println("2 ^ " + i + " = " + powOfTwo);
            }
        }
        else {
            System.out.println("Enter valid power");
        }
    }
}
