package entities;

public class CD extends Materials{
    public String toString() {
        return "[CD]: \nTITLE: "+ getTitle() + " - AUTHOR: " + getAuthor() + 
        "\nYEAR: " + getYear() + " - QUANTITIES: " + getQuantities() +"\n";
    }
}
