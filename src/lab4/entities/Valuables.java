package lab4.entities;

import lab4.Item;

public class Valuables extends Item {

    protected static String DEFAULT_NAME = "ценности";

    public Valuables() {
        super(DEFAULT_NAME);
    }

    public Valuables(String name) {
        super(name);
    }
}
