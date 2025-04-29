package level1.exercise3.logic;

public class ManagementOutOfBounds {
    private String[] peopleArray;

    public ManagementOutOfBounds() {

        peopleArray = new String[]{"Petter Caposutto", "Jim Morrison", "Mick Jagger"};

    }

    public String triggerOutOfBounds(){
        return peopleArray[3];
    }

}

