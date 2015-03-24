package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        new Biblioteca(createLibrary()).run();
    }


    private static Library createLibrary() {
        Library library = new Library();
        addBooksToLibrary(library);
        return library;
    }

    private static void addBooksToLibrary(Library library) {
        library.addBook(new Book("Wings Of Fire", "Abdul Kalam", 1994));
        library.addBook(new Book("Sherloc Holmes", "Sir Arthur Conan Doyle", 1993));
        library.addBook(new Book("Ramayana", "Valmiki",2005));
        library.addBook(new Book("Maha Baratha", "Vedh Vyas",2010));
    }
}
