package lab4.actions;

import lab4.Action;
import lab4.SelfExecutableAction;

import java.util.ArrayList;

public class Be extends SelfExecutableAction {

    protected static String DEFAULT_DESCRIPTION = "было";

    public Be() {
        super(DEFAULT_DESCRIPTION);
    }

    public Be(Action action) {
        super(DEFAULT_DESCRIPTION, action);
    }
    public Be(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

    public Be(Action subAction, ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, subAction, objects);
    }


}
