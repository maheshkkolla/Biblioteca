package com.twu.biblioteca;

/**
 * Created by maheshkk on 3/21/2015.
 */
public class Book {
    private String name;
    private String author;
    private int publishedYear;
    public Book(String name, String author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!author.equals(book.author)) return false;
        if (!name.equals(book.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    public String getBookDetailsAsText() {
        String book = "\t\tName:\t" + name + System.lineSeparator();
        book += "\t\tAuthor:\t" + author + System.lineSeparator();
        book += "\t\tPublished Year:\t" + publishedYear + System.lineSeparator();
        return book;
    }
}
