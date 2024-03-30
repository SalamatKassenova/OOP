package lecture4;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price); //calling ctor of the BASE class
        this.author = author;
    }

    //getter
    public String getAuthor(){return author;}
}


