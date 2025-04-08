package level2.exercise4;


import level2.exercise4.dataClass.Car;
import level2.exercise4.dataClass.Motorcycle;
import level2.exercise4.dataClass.ShopMotorcycleAndCar;
import level2.exercise4.dataClass.Vehicle;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class MotorcycleTest {

    @Test
    public void assertedVerifyOrderObjectsArrayList() {

       ShopMotorcycleAndCar shop = new ShopMotorcycleAndCar();

       shop.addMotorcycleAndCar(new Motorcycle("Yamaha R1", 900));
       shop.addMotorcycleAndCar(new Motorcycle("Honda Raptor", 750));
       shop.addMotorcycleAndCar(new Car("Toyota","Corolla"));
       shop.addMotorcycleAndCar(new Car("BMW","M1"));


            Assertions.assertThat(shop.getVehicleList())
                    .extracting(Vehicle::getName)
                    .withFailMessage("The order of motorcycles is not preserved")
                    .containsExactly("Yamaha R1","Honda Raptor", "Toyota","BMW");
        }
    @Test
    public void testVehicleListContainsInAnyOrder() {

        ShopMotorcycleAndCar shop = new ShopMotorcycleAndCar();
        shop.addMotorcycleAndCar(new Motorcycle("Yamaha R1", 900));
        shop.addMotorcycleAndCar(new Motorcycle("Honda Raptor", 750));
        shop.addMotorcycleAndCar(new Car("Toyota", "Corolla"));
        shop.addMotorcycleAndCar(new Car("BMW", "M1"));


        Assertions.assertThat(shop.getVehicleList())
                .extracting(Vehicle::getName)
                .withFailMessage("The order of motorcycles is not preserved")
                .containsExactlyInAnyOrder("Honda Raptor", "Toyota", "Yamaha R1", "BMW");

    }
    @Test
    public void testVehicleListContainsOnlyOnceAndNotPresent() {
        ShopMotorcycleAndCar shop = new ShopMotorcycleAndCar();

        shop.addMotorcycleAndCar(new Motorcycle("Yamaha R1", 900));
        shop.addMotorcycleAndCar(new Car("Civic", "Honda"));


    Assertions.assertThat(shop.getVehicleList())
                .extracting(Vehicle::getName)
                .withFailMessage("Only one")
                .containsOnlyOnce("Yamaha R1");

        Assertions.assertThat(shop.getVehicleList())
                .extracting(Vehicle::getName)
                .withFailMessage("Not present in the array list")
                .doesNotContain("Ferrari F40");



    }

    }

