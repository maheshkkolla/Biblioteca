package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maheshkk on 3/21/2015.
 */
public class Library {
    private List<Book> booksList = new ArrayList<Book>();


    public void addBook(Book book) {
        booksList.add(book);
    }

    public String getBooksListAsString() {
        String booksListAsText = "";
        for(Book book: booksList) {
            booksListAsText += book.toString() + "\n";
        }
        return booksListAsText;
    }

    public void printBookList() {
        System.out.println(getBooksListAsString());
    }
}
