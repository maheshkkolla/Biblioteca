package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by maheshkk on 3/22/2015.
 */
public class Menu {
    Map<Integer,MenuItem> menu = new HashMap<Integer,MenuItem>();

    public void addMenu(MenuItem menu) {
        this.menu.put(menu.getId(), menu);
    }

    @Override
    public String toString(){
        String stringMenu = "Select Menu:\n";
        Set<Integer> menuItemIds = menu.keySet();
        for(Integer itemId : menuItemIds) {
            MenuItem menu = this.menu.get(itemId);
            stringMenu += menu.toString() + "\n";
        }
        stringMenu += "Enter your option number here: ";
        return stringMenu;
    }

    public MenuItem getMenuItem(int menuId) throws InvalidOptionException {
        MenuItem item = menu.get(menuId);
        if(item == null)throw new InvalidOptionException(menuId);
        return item;
    }
}
