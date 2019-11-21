package Bog;

public class Opgave2Main {
    public static void main(String[] args) {
        Bog bog = new Bog(123456789,"Moby dick",1851);
        Bog bog1 = new Bog (123456789,"Harry Potter", 1988);
        Bibliotek bib = new Bibliotek();
        
        System.out.println(bib.tjekBøger(bog));
        bib.AddBog(bog1);
        System.out.println(bib.tjekBøger(bog));
    }
 
}
