package lab3.actions;

import lab3.Action;
import lab3.SelfExecutableAction;

import java.util.ArrayList;

public class Must extends SelfExecutableAction {
    protected static String DEFAULT_DESCRIPTION = "должны";

    public Must() {
        super(DEFAULT_DESCRIPTION);
    }

    public Must(Action action) {
        super(DEFAULT_DESCRIPTION, action);
    }
    public Must(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

    public Must(Action subAction, ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, subAction, objects);
    }

}
