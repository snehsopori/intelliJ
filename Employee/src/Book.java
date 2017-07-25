/**
 * Created by soporis on 7/19/2017.
 */
public class Book {
    private double price;
    private int isbn;
    private String author;

    public Book(double price, int isbn, String author) {
        this.price = price;
        this.isbn = isbn;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", isbn=" + isbn +
                ", author='" + author + '\'' +
                '}';
    }
}