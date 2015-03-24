package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
* Created by maheshkk on 3/23/2015.
*/
public class LibraryTests {
    @Test
    public void testLibraryContainsNoBooksBeforeAddingAnyBook(){
        Library library = new Library();
        assertEquals(library.getNumberOfBooksInLibrary(),0);
    }

    @Test
    public void testAddBookAddsNewBookToTheBookList(){
        Library library= new Library();
        library.addBook(new Book("Wings Of Fire","Abdul Kalam",2004));
        assertEquals(library.getNumberOfBooksInLibrary(), 1);
    }

    @Test
    public void testGetBookListAsStringGivesAStringWithTheDetailsOfAllBooksInLibrary(){
        Library library = new Library();
        library.addBook(new Book("Wings","APJ",2004));
        String expected = "\t\tName:\tWings" + System.lineSeparator() +
                "\t\tAuthor:\tAPJ" + System.lineSeparator() +
                "\t\tPublished Year:\t2004" + System.lineSeparator() + System.lineSeparator();
        assertEquals(library.getBooksListAsString(), expected);
    }
}
