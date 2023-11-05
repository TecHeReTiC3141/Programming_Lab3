package carTest;

public class Main {

    public static void main(String[] args) {
        MotorCar motor = new MotorCar();
        ElectricCar electric = new ElectricCar();
        motor.turnOnEngine();
        motor.accelerate();
        electric.turnOnEngine();
        electric.accelerate();

    }



}
