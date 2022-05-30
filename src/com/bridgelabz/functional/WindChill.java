package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature : ");
        float temperature = sc.nextFloat();
        System.out.print("Wind Speed : ");
        float windSpeed = sc.nextFloat();

        if (Math.abs(temperature) > 50) {
            System.err.println("The value of temperature in Fahrenheit cannot be larger that 50");
        }
        if (windSpeed > 120 || windSpeed < 3) {
            System.err.println("The value of Wind Speed in mph must be between 3 and 120");
        }

        double windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.println("The Wind Chill Teperature is: " + Math.round(windChill) + " Farhenheit");
    }
}
