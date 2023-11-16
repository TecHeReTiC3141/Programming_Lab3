package lab4.entities;

import lab4.Item;

public class Question extends Item {

    protected static String DEFAULT_NAME = "вопрос";

    public Question() {
        super(DEFAULT_NAME);
    }

    public Question(String name) {
        super(name);
    }
}
