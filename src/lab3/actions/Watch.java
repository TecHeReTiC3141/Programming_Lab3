package lab3.actions;

import lab3.Action;

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
