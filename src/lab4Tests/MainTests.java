package lab4Tests;

public class MainTests {
    public static void main(String[] args) {
        Car.Wheel front = new Car.Wheel("I'm frontwheel");
        Car.Wheel back = new Car.Wheel("I'm backwheel");
        Car.Driver driver = new Car().new Driver("Ryan Gosling (Driver) (2011)");
        Car racingCart = new Car("Racing car", driver, front, back);

        racingCart.introduce();
        racingCart.drive();
        try {
            racingCart.crash();
        } catch (CrashException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Race is over");
        }
    }
}
