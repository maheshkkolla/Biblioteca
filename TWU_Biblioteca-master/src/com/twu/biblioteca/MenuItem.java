package com.twu.biblioteca;

/**
 * Created by maheshkk on 3/21/2015.
 */
public class MenuItem {
    int id;
    String item;
    Command action;

    public MenuItem(int id, String item, Command action) {
        this.id = id;
        this.item = item;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("\t" + id + ". " + item);
    }

    public void performAction() throws QuitAppException {
        action.execute();
    }
}
