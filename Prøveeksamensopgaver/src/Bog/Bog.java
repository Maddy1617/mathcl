package Bog;

import java.util.Objects;

public class Bog {

    int ISBN_nummer;
    String titel;
    int udgivelsesår;

    public Bog(int ISBN_nummer, String titel, int udgivelsesår) {
        this.ISBN_nummer = ISBN_nummer;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getISBN_nummer() {
        return ISBN_nummer;
    }

    public void setISBN_nummer(int ISBN_nummer) {
        this.ISBN_nummer = ISBN_nummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bog other = (Bog) obj;
        if (this.ISBN_nummer != other.ISBN_nummer) {
            return false;
        }
        return true;
    }


    

    @Override
    public String toString() {
        return "Bog\n\n" + "ISBN_nummer: " + ISBN_nummer + "\nTitel: " + titel + "\nUdgivelses\u00e5r: " + udgivelsesår;
    }

}
