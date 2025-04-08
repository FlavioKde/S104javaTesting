package level1.exercise3.logic;

import level1.exercise3.dataClass.OutOfBounds;
import level1.exercise3.dataClass.People;

public class ManagementOutOfBounds {
    private String[] peopleArray;
    private OutOfBounds outOfBounds;

    public ManagementOutOfBounds() {

        peopleArray = new String[]{"Person1", "Person2"};


        outOfBounds = new OutOfBounds();
        outOfBounds.triggerOutOfBounds();
    }

    public void addPeopleBounds() {
        outOfBounds.addPeople(new People("Petter Capusotto"));
        outOfBounds.addPeople(new People("Jim Morrison"));
        outOfBounds.addPeople(new People("Mick Jagger"));
    }
}

