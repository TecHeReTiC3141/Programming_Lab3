package lab4.actions;

import lab4.Action;

import java.util.ArrayList;

public class Steal extends Action {
    protected static String DEFAULT_DESCRIPTION = "похитить";

    public Steal() {
        super(DEFAULT_DESCRIPTION);
    }


    public Steal(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }
}
