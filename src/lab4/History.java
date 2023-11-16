package lab4;

import java.util.ArrayList;

public class History {

    private ArrayList<Clause> clauses;

    public History() {
        this.clauses = new ArrayList<>();
    }

    public ArrayList<Clause> getClauses() {
        return this.clauses;
    }

    public History doAction(Clause clause) {
        this.clauses.add(clause);
        return this;
    }

    public void tell(HeroGroup heros) {
        heros.watchHistory(this);
    }

}
