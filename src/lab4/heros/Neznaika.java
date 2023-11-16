package lab4.heros;

import lab4.Clause;
import lab4.Hero;
import lab4.History;
import lab4.Watcher;

public class Neznaika extends Hero implements Watcher {

    @Override
    public void watch(History history) {
        for (Clause clause : history.getClauses()) {
            System.out.println("%s c интересом посмотрел: %s. Он подумал: \"%s\"".formatted(this.name, clause, react()));
        }
    }

    public Neznaika() {
        this.name = "Незнайка";
    }

}
