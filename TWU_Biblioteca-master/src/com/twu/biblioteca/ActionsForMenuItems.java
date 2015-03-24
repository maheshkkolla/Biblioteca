package com.twu.biblioteca;

/**
 * Created by maheshkk on 3/22/2015.
 */
public class ActionsForMenuItems {

    private Library library;

    public ActionsForMenuItems(Library library) {
        this.library = library;
    }
    public Object getActionForListBooks() {
        return new Command(){
            private Library library;
            public Object init(Library library) {
                this.library = library;
                return this;
            }
            @Override
            public void execute() {
                library.printBookList();
            }
        }.init(library);
    }

    public Object getActionForQuit() {
        return new Command() {
            @Override
            public void execute() throws QuitAppException {
                throw new QuitAppException("Thank You for using our App!!!");
            }
        };
    }
}
