package level2.exercise6.logic;

import level2.exercise6.dataClass.Aiport;
import level2.exercise6.dataClass.Plane;

public class ManagementAiport {
    private String[] aiportList;
    private Aiport aiport;

    public ManagementAiport(){
        aiportList = new String[]{};

        aiport = new Aiport();



    }
    public void addPlaneAiport(){
        aiport.addPlane(new Plane("Boing 747"));
        aiport.addPlane(new Plane("Boing 350"));
        aiport.triggerOutOfBoundsException();

    }
}
