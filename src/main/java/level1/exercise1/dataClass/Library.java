package level1.exercise1.dataClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book>books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public boolean removeBook(String name){
        boolean removed = false;

        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
            Book book = iterator.next();
            if (book.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }
    public void recoveryBook(){
        for(Book book: books){
            System.out.println(book);
        }
    }
    public Book getBookByIndex(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("Index out of bounds.");
            return null;
        }
        return books.get(index);
    }
    public void addBookAtPosition(int index, Book book) {
        if (index < 0 || index > books.size()) {
            System.out.println("Invalid index. Cannot add book.");
            return;
        }
        books.add(index, book);
        System.out.println("Book added at position " + index + ": " + book.getName());
    }

    @Override
    public String toString() {
        return "Library " +"\n"+
                "listLibrarys " + getBooks() ;
    }
}
