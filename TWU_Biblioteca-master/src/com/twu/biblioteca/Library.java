package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maheshkk on 3/21/2015.
 */
public class Library {
    private List<Book> booksList;

    public Library() {
        booksList = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        booksList.add(book);
    }

    public int getNumberOfBooksInLibrary() {
        return booksList.size();
    }

    public String getBooksListAsString() {
        String booksListAsText = "";
        for(Book book: booksList) {
            booksListAsText += book.getBookDetailsAsText() + System.lineSeparator();
        }
        return booksListAsText;
    }

    public void printBookList() {
        System.out.println(getBooksListAsString());
    }

}
