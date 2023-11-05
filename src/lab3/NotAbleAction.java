package lab3;

import java.util.ArrayList;

public abstract class NotAbleAction extends Action {

    public NotAbleAction(String description) {
        super(description);
        this.description = "не может " + this.description;
    }

    public NotAbleAction(String description, ArrayList<String> objects) {
        super(description, objects);
    }
}
