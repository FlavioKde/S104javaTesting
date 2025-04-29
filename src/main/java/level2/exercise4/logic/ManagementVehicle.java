package level2.exercise4.logic;

import level2.exercise4.dataClass.Motorcycle;
import level2.exercise4.dataClass.Car;
import level2.exercise4.dataClass.Vehicle;
import level2.exercise4.dataClass.ShopMotorcycleAndCar;

public class ManagementVehicle {
    private ShopMotorcycleAndCar shopMotorcycleAndCar;
    private Motorcycle motorcycle;
    private Car car;


    public ManagementVehicle() {
        this.shopMotorcycleAndCar = new ShopMotorcycleAndCar();


    }

    public void addShopMotorcycleAndCar() {
        shopMotorcycleAndCar.addMotorcycleAndCar(new Motorcycle("Yamaha R1", 900));
        shopMotorcycleAndCar.addMotorcycleAndCar(new Motorcycle("Honda Z19", 250));
        shopMotorcycleAndCar.addMotorcycleAndCar(new Car("Honda", "Civic"));

    }

    public void printMotorcyclesAndCar() {
        for (Vehicle vehicle : shopMotorcycleAndCar.getVehicleList()) {
            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Motorcycle: ");
                System.out.println("Name: " + motorcycle.getName());
                System.out.println("CC: " + motorcycle.getCc());
            } else if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Car: ");
                System.out.println("Name: " + car.getName());
                System.out.println("Brand: " + car.getBrand());
            } else {
                System.out.println("Unknown vehicle type.");
            }
        }
    }
}
