package lab3.actions;

import lab3.Action;

import java.util.ArrayList;

public class Become extends Action {
    protected static String DEFAULT_DESCRIPTION = "становиться";

    public Become() {
        super(DEFAULT_DESCRIPTION);
    }


    public Become(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }
}
