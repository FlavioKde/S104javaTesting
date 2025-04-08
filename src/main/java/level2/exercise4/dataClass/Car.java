package level2.exercise4.dataClass;

public class Car extends Vehicle {
    private String brand;

    public Car(String name, String brand){
        super(name);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car: " +"\n"+
                "name='" + getName() + '\n' +
                "brand=" + brand;
    }
}
