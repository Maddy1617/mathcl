package Prøveeksamensopgaver;

import java.util.InputMismatchException;
import java.util.Scanner;

class Opgave5 {

    public static void main(String[] args) {
        kørMenuvalg();
    }

    public static int kørMenuvalg() {
        Scanner in = new Scanner(System.in);
        int input = 0;
        try {
            while (input < 4) {
                System.out.println("1.       Beregn");
                System.out.println("2.       Udskriv");
                System.out.println("3.       Hjælp");
                System.out.println("4.       Luk program");
                System.out.println("");
                input = in.nextInt();

                if (input == 1) {
                    System.out.println("Du valgte menupunkt nr. 1");
                } else if (input == 2) {
                    System.out.println("Du valgte menupunkt nr. 2");
                } else if (input == 3) {
                    System.out.println("Du valgte menupunkt nr. 3");
                }
            }
            } catch (InputMismatchException ex) {
                System.out.println("Dette er ikke et gyldigt heltal");
                
            } // System.out.println(input);
        
        return input;
    }
}

