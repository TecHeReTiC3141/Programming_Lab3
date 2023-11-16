package lab4Tests;

public class Car {

    public String name;

    public Driver driver;

    public Wheel frontWheel;
    public Wheel backWheel;

    public Car() {
        this.name = "I'm car";
        this.driver = new Driver("I'm driver");
        this.frontWheel = new Wheel("I'm frontwheel");
        this.backWheel = new Wheel("I'm backwheel");
    }

    public Car(String name, Driver driver, Wheel front, Wheel back) {
        this.name = name;
        this.driver = driver;
        this.frontWheel = front;
        this.backWheel = back;
    }

    public void introduce() {
        this.driver.introduce();
    }

    public void drive() {
        this.frontWheel.rotate();
        this.backWheel.rotate();
        this.driver.drive();
    }

    public void crash() throws CrashException {
        throw new CrashException("Car " + name + " is crashed");
    }

    public class Driver {

        public String name;
        public Driver(String name) {
            this.name = name;
        }
        public void drive() {
            System.out.println("Driver " + name + " is driving");
        }

        public void introduce() {
            System.out.println("Hello, I'm %s".formatted(name));
        }
    }

    public static class Wheel {
        public String name;
        public Wheel(String name) {
            this.name = name;
        }
        public void rotate() {
            System.out.println("Wheel " + name + " is rotating");
        }
    }
}
