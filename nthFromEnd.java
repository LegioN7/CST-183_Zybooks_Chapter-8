/*
Write a program that stores a list of positive integers from input into an array and outputs the Nth number from the end of the array.
A negative integer indicates the end of the input and is not stored in the array. Convert the last negative integer to positive and use as N.
Output the last integer (as negative) if the size of the array is smaller than N.
Assume the array will always contain fewer than 20 integers.

Ex: If the input is:
1 5 9 7 5 -3
the output is:
9

Ex: If the input is:
1 2 3 4 5 -6
the output is:
-6
 */


import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input

        int i;
        int n = 0;
        int x = 0;

        for (i = 0; i < userValues.length; i++) {
            int value = scnr.nextInt();
            if (value < 0) {
                x = value;
                n = Math.abs(value);
                break;
            } else {
                userValues[i] = value;
            }
        }

        if (n > i) {
            System.out.println(x);
        } else {
            System.out.println(userValues[i - n]);
        }
    }
}
