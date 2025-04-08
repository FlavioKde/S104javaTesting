package level1.exercise3.dataClass;

import java.util.ArrayList;


public class OutOfBounds {
    private ArrayList<People>peopleList;

    public OutOfBounds(){
        this.peopleList = new ArrayList<>();
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }
    public void addPeople(People people){
        peopleList.add(people);
    }
    public void triggerOutOfBounds() {
        for(int i = 0; i<=peopleList.size(); i++){
            System.out.println(peopleList.get(i).getName());
        }
    }
}
