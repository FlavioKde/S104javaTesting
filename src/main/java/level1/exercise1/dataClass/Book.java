package level1.exercise1.dataClass;

public class Book {
    private String name;

    public Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }
}
