class library{
    String[] books;
    int noOfBooks;
    library(){
        this.books = new String[5]; //initialise
        this.noOfBooks = 0;
    }
    void addBook(String book){
        this.books[noOfBooks] = book; //we add the  book to the nth index
        noOfBooks++; //increment no of  books
        System.out.println(book + " has been added!");

    }
    void showAvailableBooks(){
        System.out.println("the available books are: ");
        for (String book : this.books){

            if (book == null) {
                continue;
            }
            System.out.println("📕 " + book);
        }
    }
    void issueBook(String book){
        for (int i = 0; i <= this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.printf("the book - %s has been issued", book);
                this.books[i] = null;
                return;
            }
        }
        System.out.println("*"+book+"does not exist ");

    }
    void returnBook(String book){
        addBook(book);
    }
}
public class AV_50_excercise_online_library {
    public static void main(String[] args) {
        library centralLibrary = new library();
       centralLibrary.addBook("the painted bird");

        centralLibrary.addBook("how to decide");
        centralLibrary.addBook("don quixote");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("don quixote");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("don quixote");
        centralLibrary.showAvailableBooks();
    }
}
