package lab3;

import lab3.colors.Colors;

public enum ActionModifier {

    NO_WAY("никак"),
    STILL("все же"),
    FOR_SOME_REASON("почему-то"),
    FINALLY("в конце концов"),
    ONE_BY_ONE("один за другим"),
    SUDDENLY("вдруг"),
    AGAIN("снова"),
    AT_THE_SAME_TIME("в то же время"),
    WHERE("где"),
    WHICH("какие"),
    WHEN("когда"),

    OR_NOT("или нет"),
    NEARLY("вот-вот"),
    BY_THE_WAY("между тем"),
    PROGRESSING("все"),
    FROM_ABOVE("вверху"),
    AT_INTERESTING_PLACE("на самом интересном месте"),
    ;

    private String description;

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return Colors.ANSI_YELLOW + this.description + Colors.ANSI_RESET;
    }

    ActionModifier(String description) {
        this.description = description;
    }


}
