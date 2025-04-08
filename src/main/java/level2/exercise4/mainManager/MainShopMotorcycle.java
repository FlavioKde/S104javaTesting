package level2.exercise4.mainManager;

import level2.exercise4.logic.ManagementVehicle;

public class MainShopMotorcycle {

    public static void main(String[] args) {

        ManagementVehicle managementVehicle = new ManagementVehicle();
        managementVehicle.addShopMotorcycleAndCar();
        managementVehicle.printMotorcyclesAndCar();
    }
}
