package lab4;

public class Clause {
    public Hero executor;

    public Action action;

    public Clause(Hero hero, Action action) {
        this.executor = hero;
        this.action = action;
    }

    public Clause(Action action) {
        this.action = action;
    }

    public String toString() {
        if (this.executor != null) {
            return "Исполнитель: [%s] сделал действие: [%s]".formatted(this.executor.toString(),
                    this.action.toString());
        }
        return "Действие было сделано: [%s]".formatted(this.action instanceof SelfExecutableAction self ?
                self.executeSelf() : this.action.toString());
    }
}
