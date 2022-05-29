package com.bridgelabz.basiccore;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.print("Enter an Alphabet to check whether it is Vowel or Consonant = ");
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
                || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println(alphabet + " is a VOWEL");
        } else {
            System.out.println(alphabet + " is a CONSONANT");
        }
    }
}
