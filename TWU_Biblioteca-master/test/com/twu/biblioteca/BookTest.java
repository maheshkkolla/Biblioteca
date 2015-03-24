package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testBookGetBookDetailsAsTextGivesTheDetailsOfBookInPrintableTextFormat(){
        Book wings = new Book("Wings","APJ",2004);
        String expected = "\t\tName:\tWings" + System.lineSeparator() +
                "\t\tAuthor:\tAPJ" + System.lineSeparator() +
                "\t\tPublished Year:\t2004" + System.lineSeparator();
        assertEquals(expected,wings.getBookDetailsAsText());
    }
}