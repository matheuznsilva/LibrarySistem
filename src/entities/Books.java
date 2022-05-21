package entities;

public class Books extends Materials{
    private String publisher;

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String toString() {
        return "[BOOK]: \nTITLE: "+ getTitle() + " - AUTHOR: " + getAuthor() + 
        " - PUBLISHER: " + publisher + "\nYEAR: " + getYear() + 
        " - QUANTITIES: " + getQuantities() +"\n";
    }
}
