package lab4;

import java.util.ArrayList;

public abstract class SelfExecutableAction extends Action {

    private Action subAction;

    public SelfExecutableAction(String description) {
        super(description);
        this.subAction = null;
    }

    public SelfExecutableAction(String description, Action subAction) {
        super(description);
        this.subAction = subAction;
    }

    public SelfExecutableAction(String description, Action subAction, ArrayList<String> objects) {
        super(description, objects);
        this.subAction = subAction;
    }

    public SelfExecutableAction(String description, ArrayList<String> objects) {
        super(description, objects);
    }

    public void setSubAction(Action subAction) {
        this.subAction = subAction;
    }

    public String executeSelf() {
        return this.toString() + (this.subAction == null ? "" :
                this.subAction instanceof SelfExecutableAction sub ?
                        " " + sub.executeSelf() : this.subAction.toString());
    }

}
