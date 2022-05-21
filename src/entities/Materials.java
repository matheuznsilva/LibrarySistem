package entities;

public class Materials {
    private String title;
    private String author;
    private Integer year;
    private Integer quantities;
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuantities() {
        return quantities;
    }
    public void setQuantities(Integer quantities) {
        this.quantities = quantities;
    }

    public String toString() {
        return "TITLE: "+ title + " - AUTHOR: " + author + 
        "\nYEAR: " + year + " - QUANTITIES: " + quantities;
    }

}
