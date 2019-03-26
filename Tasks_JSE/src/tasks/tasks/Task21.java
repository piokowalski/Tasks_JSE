package tasks.tasks;

public class Task21 {
    public void run() {

        Car carA = new Car();
        carA.id = 1169;

        Car carB = new Car();
        carB.id = 2255;

        Vehicle vehA = new Vehicle();
        vehA.id = 666;

        vehA.printId();
        carA.printId();
        carB.printId();


        }

    public class Vehicle {
        int id;

        public void printId() {
            System.out.println(id);
        }
    }
    public class Car extends Vehicle {

    }
}
