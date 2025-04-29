package level2.exercise6.logic;

public class ManagementAiport {
    private String[] aiportList;


    public ManagementAiport() {
        aiportList = new String[]{"Boing 747", "Boing 351"};
    }

    public String triggerOutOfBounds() {
        return aiportList[3];
    }
}
