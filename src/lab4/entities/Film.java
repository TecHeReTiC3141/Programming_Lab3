package lab4.entities;


import lab4.Item;

public class Film extends Item {

    protected static String DEFAULT_NAME = "фильм";

    public Film() {
        super(DEFAULT_NAME);
    }

    public Film(String name) {
        super(name);
    }
}
