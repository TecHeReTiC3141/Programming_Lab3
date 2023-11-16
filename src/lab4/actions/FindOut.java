package lab4.actions;

import lab4.SelfExecutableAction;

import java.util.ArrayList;

public class FindOut extends SelfExecutableAction {
    protected static String DEFAULT_DESCRIPTION = "выяснить";

    public FindOut() {
        super(DEFAULT_DESCRIPTION);
    }


    public FindOut(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

}
