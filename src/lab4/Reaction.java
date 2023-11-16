package lab4;

import lab4.colors.Colors;

import java.util.*;

public enum Reaction {

    EXCITED("Я взволнован"),
    DROWSY("Я расстроен"),
    CHEER("Я рад!"),
    SAD("Я грущу"),
    ANGRY("Я злой"),
    ;


    private String description;

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return Colors.ANSI_YELLOW + this.description + Colors.ANSI_RESET;
    }

    Reaction(String description) {
        this.description = description;
    }

    private static final List<Reaction> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Reaction randomReaction()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
