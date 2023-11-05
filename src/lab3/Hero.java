package lab3;

import lab3.colors.Colors;

import java.util.Objects;

public abstract class Hero implements Entity, AbleToExecute {

    protected static String DEFAULT_NAME = "герой";

    protected String name;

    public Hero() {
        this.name = DEFAULT_NAME;
    }

    public Hero(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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
