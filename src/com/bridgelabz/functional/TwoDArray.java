package com.bridgelabz.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        PrintWriter printWriterObject = new PrintWriter(System.out, true);
        int numberOfRows, numberOfColumns;

        System.out.print("Enter the number of Rows : ");
        numberOfRows = scannerObject.nextInt();
        System.out.print("Enter the number of Columns : ");
        numberOfColumns = scannerObject.nextInt();

        int[][] twoDArray = new int[numberOfRows][numberOfColumns];
        System.out.println("----------------------------");
        for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
                System.out.print("Enter the array elements : ");
                twoDArray[rowIndex][columnIndex] = scannerObject.nextInt();

            }
        }
        System.out.println("----------------------------");

        System.out.println("The array elements are: ");
        for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
            for ( int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++ ) {
                printWriterObject.print ( twoDArray[rowIndex][columnIndex] + "\t" );
            }
            printWriterObject.println();
        }
    }
}
