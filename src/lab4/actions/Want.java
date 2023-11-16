package lab4.actions;

import lab4.Action;
import lab4.SelfExecutableAction;

import java.util.ArrayList;

public class Want extends SelfExecutableAction {

    protected static String DEFAULT_DESCRIPTION = "хочется";

    public Want() {
        super(DEFAULT_DESCRIPTION);
    }

    public Want(Action action) {
        super(DEFAULT_DESCRIPTION, action);
    }
    public Want(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

    public Want(Action subAction, ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, subAction, objects);
    }
}
