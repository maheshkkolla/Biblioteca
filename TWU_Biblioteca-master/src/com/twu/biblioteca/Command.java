package com.twu.biblioteca;

/**
 * Created by maheshkk on 3/22/2015.
 */
public interface Command {
    public void execute() throws QuitAppException;
}
