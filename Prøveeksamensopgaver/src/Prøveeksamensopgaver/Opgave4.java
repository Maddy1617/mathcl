package Prøveeksamensopgaver;

import java.util.Scanner;

public class Opgave4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hvilket symbol vil du tegne med? ");
        char symbol = in.next().charAt(0);
        drawBox(6, symbol);
    }

    public static void drawBox(int size, char symbol) {
        //char myChar = '*';
        String linje = "";
        for (int i = 0; i < size; i++) {
            linje += symbol;
        }
        for (int j = 0; j < size; j++) {
            System.out.println(linje);
        }
            
        

    }

}
