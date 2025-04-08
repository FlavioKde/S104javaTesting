package level2.exercise4.dataClass;

public class Motorcycle extends Vehicle {
    private int cc;

    public Motorcycle(String name, int cc){
        super(name);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public String toString() {
        return "Motorcycle: " +"\n"+
                "name='" + getName() + '\n' +
                "cc=" + cc;
    }
}
