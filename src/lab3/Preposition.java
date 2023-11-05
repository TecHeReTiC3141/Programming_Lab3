package lab3;

public enum Preposition {

    IN("в"),
    BEFORE("до"),
    WITH("c"),
    ON ("на");

    private String name;

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    Preposition(String name) {
        this.name = name;
    }


}
