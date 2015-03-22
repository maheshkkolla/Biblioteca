package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaAppTests {

//    @Test
//    public void test_getWelcomeMessage_gives_welocme_message() {
//        String welcomeMessage = new BibliotecaApp().getWelcomeMessage();
//        assertEquals("**************************\n" +
//                "* Welcome to Biblioteca! *\n" +
//                "**************************\n",welcomeMessage);
//    }

    @Test
    public void test_getAllBooks_gives_the_list_of_books() {
        String expectedBooks = "\t\tName:\tWings Of Fire\n" +
            "\t\tAuthor:\tAbdul Kalam\n\t\tPublished Year:\t1994\n\n" +
            "\t\tName:\tSherloc Holmes\n\t\tAuthor:\tSir Arthur Conan Doyle\n" +
            "\t\tPublished Year:\t1993\n\n";
        Library lib = new Library();
        lib.addBook(new Book("Wings Of Fire","Abdul Kalam",1994));
        lib.addBook(new Book("Sherloc Holmes","Sir Arthur Conan Doyle",1993));
        assertEquals(expectedBooks, lib.getBooksListAsString());
    }
}
