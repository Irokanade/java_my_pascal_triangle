/*
 * Pascal Triangle 5 rows      
 * 
 * 0c0
 * 1c0 1c1
 * 2c0 2c1 2c2
 * 3c0 3c1 3c2 3c3
 * 4c0 4c1 4c2 4c3 4c4
 * 
 */

import java.util.Scanner;

public class MyPascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number for factorial: ");
        int m = input.nextInt();

        // top half
        for(int i = 0; i <= m; ++i) {
            // print spaces for alignment
            for(int j = 0; j < (m-i); ++j) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; ++j) {
                System.out.print(nCr(i, j) + " ");
            }

            System.out.println("");
        }

        // bottom half
        for(int i = m-1; i >= 0; --i) {
            // print spaces for alignment
            for(int j = 0; j < (m-i); ++j) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; ++j) {
                System.out.print(nCr(i, j) + " ");
            }

            System.out.println("");
        }
    }

    public static int myIntFactorial(int num) {
        int output = 1;
        for(; num > 0; --num) {
            output *= num;
        }

        return output;
    }

    public static int nCr(int n, int r) {
        return myIntFactorial(n)/((myIntFactorial(n-r))*(myIntFactorial(r)));
    }
}
