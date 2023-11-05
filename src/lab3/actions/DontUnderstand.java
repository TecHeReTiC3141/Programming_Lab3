package lab3.actions;

import lab3.NotAbleAction;
import java.util.ArrayList;

public class DontUnderstand extends NotAbleAction {
    protected static String DEFAULT_DESCRIPTION = "понять";

    public DontUnderstand() {
        super(DEFAULT_DESCRIPTION);
    }

    public DontUnderstand(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
