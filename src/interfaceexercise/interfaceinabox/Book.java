package interfaceexercise.interfaceinabox;

public class Book implements Packable{

    String author;
    String nameOfBook;
    double weightBook;

    public Book(String author, String nameOfBook, double weightBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.weightBook = weightBook;
    }

    @Override
    public double weight() {
        return this.weightBook;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.nameOfBook;
    }
}
