package lab4.actions;

import lab4.Action;

import java.util.ArrayList;

public class Watch extends Action {

    protected static String DEFAULT_DESCRIPTION = "смотреть";

    public Watch() {
        super(DEFAULT_DESCRIPTION);
    }


    public Watch(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

}
