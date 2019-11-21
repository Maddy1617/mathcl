package Prøveeksamensopgaver;

import java.util.Scanner;

    public class Opgave3 {
        public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Hvor højt må græsset blive? ");
         double max_højde = scan.nextDouble();
         System.out.println("Hvor højt er græsset nu? ");
         double højde_nu = scan.nextDouble();
         skalGræssetSlås(max_højde, højde_nu);
        }


    public static void skalGræssetSlås(double max_højde, double højde_nu) {
        double vækstRate = 0.8;
        double hvorMangeDage = (max_højde - højde_nu) / vækstRate;
        System.out.println("Hvor mange dage til græsset skal slås? " + hvorMangeDage + " dage");
        
}
}