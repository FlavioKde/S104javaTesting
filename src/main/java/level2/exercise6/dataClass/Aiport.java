package level2.exercise6.dataClass;

import java.util.ArrayList;
import java.util.List;

public class Aiport {
    private List<Plane>planeList;

    public Aiport(){
        this.planeList = new ArrayList<>();
    }

    public List<Plane> getPlaneList() {
        return planeList;
    }
    public void addPlane(Plane plane){
        planeList.add(plane);
    }
    public void triggerOutOfBoundsException(){
        for(int i = 0; i<=planeList.size(); i++){
            System.out.println(planeList.get(i).getName());
        }
    }
}
