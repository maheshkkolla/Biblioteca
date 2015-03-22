package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    private Library library;

    public BibliotecaApp(Library library) {
        this.library = library;
    }

    public static Library getLibrary() {
        Library library = new Library();
        addBooksToLibrary(library);
        return library;
    }

    public String getWelcomeMessage() {
        String message = "Welcome to Biblioteca!";
        message = makeBanner(message);
        return message;
    }

    private String makeBanner(String message) {
        char[] star = new char[message.length()+4];
        Arrays.fill(star, '*');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(star);
        stringBuilder.append("\n");
        stringBuilder.append("* " + message + " *\n");
        stringBuilder.append(star);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Library library = getLibrary();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library);
        System.out.println(bibliotecaApp.getWelcomeMessage());
        Menu menu = bibliotecaApp.createAndGetMenuWithActions();

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(menu);
            try {
                menu.getMenuItem(scanner.nextInt()).performAction();
            } catch (QuitAppException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch(InvalidOptionException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private Menu createAndGetMenuWithActions() {
        Menu menu = new Menu();
        ActionForMenuItem action = new ActionForMenuItem(library);
        menu.addMenu(new MenuItem(1, "List Of Books", (Command) action.getActionForListbooks()));
        menu.addMenu(new MenuItem(2, "Quit", (Command) action.getActionForQuit()));
        return menu;
    }



    private static void addBooksToLibrary(Library library) {
        library.addBook(new Book("Wings Of Fire", "Abdul Kalam", 1994));
        library.addBook(new Book("Sherloc Holmes", "Sir Arthur Conan Doyle", 1993));
        library.addBook(new Book("Ramayana", "Valmiki",2005));
        library.addBook(new Book("Maha Baratha", "Vedh Vyas",2010));
    }
}
