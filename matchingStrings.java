/*
Write a program that compares two strings given as input. Output the number of characters that match in each string position. The output should use the correct verb (match vs matches) according to the character count.

Ex: If the input is:
crash crush
the output is: 4 characters match

Ex: If the input is:
cat catnip
the output is: 3 characters match

Ex: If the input is:
mall saw
the output is: 1 character matches

Ex: If the input is:
apple orange
the output is: 0 characters match
*/

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String string1;
        String string2;
        int i;

        // Input for the values
        string1 = scnr.next();
        string2 = scnr.next();

        // Grabs the minimum length of the array
        int minLength = Math.min(string1.length(), string2.length());
        
        int counter = 0;
        for (i = 0; i < minLength; i++) {
            if(string1.charAt(i) == string2.charAt(i)) {
                counter++;
            }
        }
            if (counter == 1)
            {
               System.out.println("1 character matches");
            } else {
            System.out.println(counter + " characters match");
            }
        }
    }
