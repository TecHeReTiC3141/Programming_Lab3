package lab3.actions;

import lab3.Action;
import lab3.SelfExecutableAction;

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
