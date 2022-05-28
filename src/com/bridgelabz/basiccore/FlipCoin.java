package com.bridgelabz.basiccore;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i,a,n,head,tail;

        float h_percentage,t_percentage;
        float h = 0;
        float t = 0;

        System.out.print("How many times coin should be flip = ");
        n = sc.nextInt();
        Random r = new Random();

        if (n>0) {
            for (i=1;i<=n;i++) {
                a = r.nextInt(2);
                if (a < 0.5) {
                    t = t+1;
                }
                else {
                    h = h+1;
                }
            }
        h_percentage = (h/n)*100;
        System.out.println("Head % : "+h_percentage);
        t_percentage = (t/n)*100;
        System.out.println("Tail % : "+t_percentage);
        }
        else {
                System.out.println("Enter Positve No.");
            }
    }
}
