package lab4.actions;

import lab4.Action;

import java.util.ArrayList;

public class LeanOut extends Action {
    protected static String DEFAULT_DESCRIPTION = "высунуться";

    public LeanOut() {
        super(DEFAULT_DESCRIPTION);
    }


    public LeanOut(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }
}
