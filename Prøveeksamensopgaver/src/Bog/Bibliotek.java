package Bog;

import java.util.ArrayList;

public class Bibliotek {

    ArrayList<Bog> bøger = new ArrayList();
    
    public boolean tjekBøger(Bog bog) {
        
        for (Bog bog1 : bøger) {
            if (bog1.equals(bog)) {
                return true;
            } 
            } return false;
            
        }
    public void AddBog(Bog bog) {
        bøger.add(bog);
    }
    

    }

