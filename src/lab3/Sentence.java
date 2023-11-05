package lab3;

import lab3.utils.GetArrayString;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<String> clauses;
    private boolean lastAnd;

    public Sentence() {
        this.clauses = new ArrayList<>();
        this.lastAnd = false;
    }

    public Sentence(boolean lastAnd) {
        this.clauses = new ArrayList<>();
        this.lastAnd = lastAnd;
    }

    public void addClause(String clause) {
        this.clauses.add(clause);
    }

    public String toString() {
        String s = "";
        if (this.clauses.isEmpty()) return s;

        String firstClause = this.clauses.get(0);
        for (int i = 0; i < firstClause.length(); ++i) {
            if (firstClause.charAt(i) == 'm') {
                firstClause = firstClause.substring(0, i + 1)
                        + firstClause.substring(i + 1, i + 2).toUpperCase()
                        + firstClause.substring(i + 2, firstClause.length());
                break;
            }
        }

        this.clauses.set(0, firstClause);
        if (!this.lastAnd) {

            for (String clause : this.clauses.subList(0, this.clauses.size() - 1)) {
                s += clause.strip() + ", ";
            }
            s += this.clauses.get(this.clauses.size() - 1) + ".";
        } else {
            s += GetArrayString.getArrayString(this.clauses);
        }

        return s;
    }
}
