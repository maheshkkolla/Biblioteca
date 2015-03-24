package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest  {
    @Test
    public void testGetPrintableMenuGivesTheMenuAsTextWithAllAddedMenuItems(){
        Menu menu = new Menu();
        ActionsForMenuItems actions = new ActionsForMenuItems(new Library());
        menu.addMenuItem(new MenuItem(1, "List Books", (Command) actions.getActionForListBooks()));
        String expected = "Select Menu:" + System.lineSeparator() +
                "\t1. List Books" + System.lineSeparator() +
                "Enter your option number here: ";
        assertEquals(expected,menu.getPrintableMenu());
    }
}