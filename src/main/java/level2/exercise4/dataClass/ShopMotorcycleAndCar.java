package level2.exercise4.dataClass;

import java.util.ArrayList;
import java.util.List;

public class ShopMotorcycleAndCar {
    private List<Vehicle>vehicleList;


    public ShopMotorcycleAndCar(){
        this.vehicleList = new ArrayList<>();
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addMotorcycleAndCar(Vehicle vehicle){
       vehicleList.add(vehicle);

    }

}
