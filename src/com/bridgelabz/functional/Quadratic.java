package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a,b,c;
        float delta,root1,root2;
        Scanner sc = new Scanner(System.in);
        System.out.print("value of a = ");
        a = sc.nextInt();
        System.out.print("value of b = ");
        b = sc.nextInt();
        System.out.print("value of c = ");
        c = sc.nextInt();

        delta = (b * b) - (4 * a * c);
        root1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
        root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);

        if (!(delta > 0)) {
            System.out.println("Roots are not real.\n Try again for another values of a, b, c");
            return;
        }
        System.out.println("First Root of x :  " + root1 + "\nSecond Root of x :  " + root2);

    }
}
