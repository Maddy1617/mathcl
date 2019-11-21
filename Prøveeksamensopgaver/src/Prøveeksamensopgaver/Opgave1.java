package Prøveeksamensopgaver;

import java.util.ArrayList;
import java.util.Collections;

public class Opgave1 {

    public static void main(String[] args) {
        ArrayList<String> bilen = new ArrayList();
        bilen.add("Skoda");
        bilen.add("Volvo");
        bilen.add("Fiat");
        System.out.println(ArrayListAndString("Skoda", bilen));
    }

    public static boolean ArrayListAndString(String bil, ArrayList<String> biler) {
        Collections.sort(biler);
        for (String antalBiler : biler) {
            System.out.println(antalBiler);
            
        }
        if (biler.contains(bil)) {

            return false;
        }

        if (!biler.contains(bil)) {
            biler.add(bil);
        }

        return true;

    }
}
