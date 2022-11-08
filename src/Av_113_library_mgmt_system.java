import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to ){
        System.out.println("book has been issued from the library to  " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("the book has been returned");
        this.books.add(b);
    }
}
public class Av_113_library_mgmt_system {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("algorithms " , " CLRS ");
        bk.add(b1);
        Book b2 = new Book("the happiness trap " , "Russ harris ");
        bk.add(b2);
        Book b3 = new Book("The painted bird " , " jerzy kosinski ");
        bk.add(b3);
        bk.add(new Book("Get out of your mind and into your life " , " Steven hayes "));
        bk.add(new Book("feeling good" , " david burns"));
        bk.add(new Book("Game " , " RooshV "));
        bk.add(new Book("Antifragile " , " Nicholas Nassim Taleb "));
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("inferno", "Dante"));
        System.out.println(l.books);
        l.issueBook(b3,  "Rhea");
        System.out.println(l.books);
    }
}
