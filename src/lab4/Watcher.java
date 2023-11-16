package lab4;

public interface Watcher {
    void watch(History history);
    default Reaction react() {
        return Reaction.randomReaction();
    };
}
