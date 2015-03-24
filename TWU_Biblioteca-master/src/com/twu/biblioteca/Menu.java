package com.twu.biblioteca;

import java.util.*;

/**
 * Created by maheshkk on 3/22/2015.
 */
public class Menu {
    List<MenuItem> menu = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem menu) {
        this.menu.add(menu);
    }

    public String getPrintableMenu() {
        String stringMenu = "Select Menu:" + System.lineSeparator();
        stringMenu += getTextMenu();
        stringMenu += "Enter your option number here: ";
        return stringMenu;
    }

    private String getTextMenu() {
        String stringMenu = "";
        for(MenuItem item: menu)
            stringMenu += item.toString() + System.lineSeparator();
        return stringMenu;
    }

    private MenuItem getMenuItemOf(int menuItemId) throws InvalidOptionException {
        for (MenuItem item: menu){
            if(item.isYourId(menuItemId)) return item;
        }
        throw new InvalidOptionException(menuItemId);

    }

    public void performActionOfItem(int menuItemId) throws InvalidOptionException, QuitAppException {
        getMenuItemOf(menuItemId).performAction();
    }
}
