package lab4.actions;

import lab4.Action;

import java.util.ArrayList;

public class Appear extends Action {
    protected static String DEFAULT_DESCRIPTION = "возникать";

    public Appear() {
        super(DEFAULT_DESCRIPTION);
    }


    public Appear(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }
}
