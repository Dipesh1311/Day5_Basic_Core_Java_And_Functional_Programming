package com.bridgelabz.basiccore;

import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args) {
        int No;
        double HarmNo = 0;
        System.out.print("Enter Nth Harmonic No. : ");
        Scanner sc =new Scanner(System.in);
        No = sc.nextInt();

        for (int i=1;i<=No;i++) {
            HarmNo = HarmNo + (double) 1/i;
        }
        System.out.print(+No+"th Harmonic No. : "+HarmNo);
    }
}
