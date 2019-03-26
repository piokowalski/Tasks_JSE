package tasks.tasks;

import tasks.tasks.Classes.VehicleInterface;

public class Task23 {
    public void run() {
        Car car = new Car();
        car.printId();

        VehicleInterface car2 = (VehicleInterface) new Car();

        Task21.Vehicle car3 = new Car();

    }

    public class Car extends Task21.Vehicle {

    }
}
