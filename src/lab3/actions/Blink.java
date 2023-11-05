package lab3.actions;

import lab3.Action;

import java.util.ArrayList;

public class Blink extends Action {
    protected static String DEFAULT_DESCRIPTION = "замигать";

    public Blink() {
        super(DEFAULT_DESCRIPTION);
    }


    public Blink(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }
}
