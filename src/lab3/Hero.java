package lab3;

import lab3.colors.Colors;

public abstract class Hero implements Entity, AbleToExecute {

    public static String var = "dsfajdskf";

    protected static String DEFAULT_NAME = "герой";

    protected String name;

    public Hero() {
        this.name = DEFAULT_NAME;
    }


    public Hero(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public String toString() {
        return Colors.ANSI_BLUE + this.name + Colors.ANSI_RESET;
    }

    @Override
    public String executeAction(Action action) {
        return this.toString() + " " + action.toString();
    }
}
