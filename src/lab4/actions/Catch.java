package lab4.actions;

import lab4.SelfExecutableAction;
import lab4.Action;
import java.util.ArrayList;

public class Catch extends SelfExecutableAction {

    protected static String DEFAULT_DESCRIPTION = "поймать";
    public Catch() {
        super(DEFAULT_DESCRIPTION);
    }

    public Catch(Action action) {
        super(DEFAULT_DESCRIPTION, action);
    }
    public Catch(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

    public Catch(Action subAction, ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, subAction, objects);
    }

}
