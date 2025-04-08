package level2.exercise6.dataClass;

public class Plane {
    private String name;

    public Plane(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plane: " +"\n"+
                "name " + name ;
    }
}
