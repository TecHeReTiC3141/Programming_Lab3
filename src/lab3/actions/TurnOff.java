package lab3.actions;

import lab3.Action;

import java.util.ArrayList;

public class TurnOff extends Action {
    protected static String DEFAULT_DESCRIPTION = "выключиться";

    public TurnOff() {
        super(DEFAULT_DESCRIPTION);
    }


    public TurnOff(ArrayList<String> objects) {
        super(DEFAULT_DESCRIPTION, objects);
    }
}
