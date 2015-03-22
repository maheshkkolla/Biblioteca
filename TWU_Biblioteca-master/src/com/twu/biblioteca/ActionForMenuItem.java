package com.twu.biblioteca;

/**
 * Created by maheshkk on 3/22/2015.
 */
public class ActionForMenuItem {

    private Library library;

    public ActionForMenuItem(Library library) {
        this.library = library;
    }
    public Object getActionForListbooks() {
        return new Command(){
            public Library library;
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
