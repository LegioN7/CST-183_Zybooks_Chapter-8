/*
Write a program that reads a list of integers from input and determines if the list is a palindrome (values are identical from first to last and last to first).
The input begins with an integer indicating the length of the list that follows. Assume that the list will always contain fewer than 20 integers. Output "yes" if the list is a palindrome and "no" otherwise.
The output ends with a newline.

Ex: If the input is:

6 
1 5 9 9 5 1
the output is:
yes
*/

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int i;
        
        // gets the inut from the user
        int n = scnr.nextInt();
        
        // Sets the array values
        for (i = 0; i < n; i++)
        {
            userValues[i] = scnr.nextInt();
        }
        
        // Sets a counter for the Palindrome
        int counter = 0;
        
        // Loops through and compares the values for Palindrome
        for (i = 0; i <= n / 2; i++)
        {
            if (userValues[i] != userValues[n - i - 1])
            {
                counter = 1;
                break;
            }
        }

        if (counter == 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

        }

    }
