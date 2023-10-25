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
