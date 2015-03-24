package com.twu.biblioteca;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by maheshkk on 3/23/2015.
 */
public class Biblioteca {
    private final Library library;

    public Biblioteca(Library library) {
        this.library = library;
    }

    private Menu createAndGetMenuWithActions() {
        Menu menu = new Menu();
        ActionsForMenuItems action = new ActionsForMenuItems(library);
        menu.addMenuItem(new MenuItem(1, "List Of Books", (Command) action.getActionForListBooks()));
        menu.addMenuItem(new MenuItem(2, "Quit", (Command) action.getActionForQuit()));
        return menu;
    }
    private String makeBanner(String message) {
       String banner = "**********Welcome To Biblioteca***********";
       return banner;
    }

    public String getWelcomeMessage() {
        String message = "Welcome to Biblioteca!";
        message = makeBanner(message);
        return message;
    }

    public void run() {
        System.out.println(getWelcomeMessage());
        Menu menu = createAndGetMenuWithActions();
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(menu.getPrintableMenu());
            handleMenuOption(menu, scanner.nextInt());
        }
    }

    private void handleMenuOption(Menu menu, int selectedMenuItem) {
        try {
            menu.performActionOfItem(selectedMenuItem);
        } catch (QuitAppException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch(InvalidOptionException e){
            System.out.println(e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println("Don't enter words, Enter valid Option number");
        }
    }

}
