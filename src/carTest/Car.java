package carTest;

public interface Car {
    default void turnOnEngine() {
        System.out.println("I don't have an engine!");
    };
    void accelerate();
}
