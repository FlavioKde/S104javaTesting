package level1.exercise1.test;


import level1.exercise1.dataClass.Book;
import level1.exercise1.dataClass.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Harry Potter"));
        library.addBook(new Book("Anne Green"));
        library.addBook(new Book("1984"));
    }

    @Test
    public void testAddBook() {
        library.addBook(new Book("The hobbit"));
        assertEquals(4, library.getBooks().size(), "The library should contain 4 books after adding a new one");

        boolean found = false;
        for (Book book : library.getBooks()) {
            if (book.getName().equalsIgnoreCase("The hobbit")) {
                found = true;
                break;
            }
        }
        assertTrue(found, "The book 'The hobbit' should be in the collection");
    }
    @Test
    public void testNotNull(){

        library.addBook(new Book("The Hobbit"));
        Book book = library.getBookByIndex(3);

        assertNotNull(book,"Position number 3 after adding the book must not be NUll");
        assertEquals("The Hobbit", book.getName(),"The book is The Hobbit");
    }

    @Test
    public void testListSize(){
        assertEquals(3, library.getBooks().size(),"This bookcase must have 4 books");
    }

    @Test
    public void testRemoveBook() {
        boolean remove = library.removeBook("1984");

        assertTrue(remove, "The book '1984' should be deleted from the collection");
        assertEquals(2, library.getBooks().size(), "The library should contain 2 books after removing one");
    }

    @Test
    public void testListBook() {
        assertNotNull(library.getBooks(), "The book collection should not be null");
        library.recoveryBook();
    }

    @Test
    public void testGetBookByPosition() {
        Book book = library.getBookByIndex(1);

        assertNotNull(book, "The book at index 1 should not be null");
        assertEquals("Anne Green", book.getName(), "The book at index 1 should be 'Anne Green'");
    }

    @Test
    public void testAddBookByPosition() {
        library.addBookAtPosition(1, new Book("The war in the world"));

        assertEquals(4, library.getBooks().size(), "The library should contain 4 books after adding a new one at a specific position");
        assertEquals("The war in the world", library.getBookByIndex(1).getName(), "The book at index 1 should be 'The war in the world'");
    }
    @Test
    public void testNoDuplicateBooks() {
        library.addBook(new Book("Harry Potter"));

        boolean hasDuplicates = false;

        for (int i = 0; i < library.getBooks().size(); i++) {
            for (int j = i + 1; j < library.getBooks().size(); j++) {
                if (library.getBooks().get(i).getName().equalsIgnoreCase(library.getBooks().get(j).getName())) {
                    hasDuplicates = false;
                    break;
                }
            }
        }

        assertFalse(hasDuplicates, "The book list should not contain duplicate titles");
    }

    @Test
    public void testListIsAlphabeticallyOrdered() {
        library.addBook(new Book("Zebra"));
        library.addBook(new Book("Alpha"));

        Collections.sort(library.getBooks(), new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });

        List<Book> sorted = new ArrayList<>(library.getBooks());
        Collections.sort(sorted, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });


        assertEquals(sorted, library.getBooks(), "The book list should be alphabetically ordered");
    }


}
