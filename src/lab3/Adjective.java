package lab3;

import lab3.colors.Colors;

public class Adjective {

    private String name;

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
