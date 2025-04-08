package level1.exercise1.logic;

import level1.exercise1.dataClass.Book;
import level1.exercise1.dataClass.Library;


public class ManagementLibrary {
    private Library library;

    public ManagementLibrary(){

        this.library = new Library();
        loadLibrary();
    }
    public void loadLibrary (){
       System.out.println("Loading books into the library...");

       library.addBook(new Book("Harry Potter"));
       library.addBook(new Book("Anne Green"));
       library.addBook(new Book("1984"));
       library.addBook(new Book("The Hobbit"));


}
    public void listBook(){
        System.out.println("Listing all books:");
        library.recoveryBook();
}
    public void addBookAtPosition(int index, String name) {
        library.addBookAtPosition(index, new Book(name));
    }
    public void getBookByPosition(int index) {
        Book book = library.getBookByIndex(index);
        if (book != null) {
            System.out.println("Book at position " + index + ": " + book.getName());
        }
    }

    public void removeBook(String name) {
        boolean removed = library.removeBook(name);
        if (removed) {
            System.out.println("Book removed: " + name);
        } else {
            System.out.println("Book not found: " + name);
        }
    }
}
