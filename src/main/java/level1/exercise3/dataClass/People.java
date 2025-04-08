package level1.exercise3.dataClass;

public class People {
    private String name;

    public People(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People " + "\n"+
                "name= " + name ;
    }
}
