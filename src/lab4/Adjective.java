package lab4;

import lab4.colors.Colors;

import java.util.Objects;

public class Adjective {

    private final String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adjective adjective = (Adjective) o;
        return Objects.equals(name, adjective.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Adjective(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return Colors.ANSI_PURPLE + this.name + Colors.ANSI_RESET;
    }
}
