package ie.atu.Producttv6;

public class Book extends Product{
    public String author;

    public Book(){
        author = "";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
