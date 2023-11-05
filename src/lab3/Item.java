package lab3;

import lab3.colors.Colors;

import java.util.Objects;

public abstract class Item implements Entity {

    protected static String DEFAULT_NAME = "предмет";

    protected String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Item() {
        this.name = DEFAULT_NAME;
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return Colors.ANSI_CYAN + this.name + Colors.ANSI_RESET;
    }
}
