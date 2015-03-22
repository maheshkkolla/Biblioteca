package com.twu.biblioteca;

/**
 * Created by maheshkk on 3/22/2015.
 */
public class InvalidOptionException extends Throwable {
    public InvalidOptionException(int menuId) {
        super(menuId + " is not a valid option. Please enter valid option");
    }
}
